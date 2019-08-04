package com.example.halftime.companies;

import android.app.LoaderManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.halftime.CompanyAdapter;
import com.example.halftime.News;
import com.example.halftime.NewsAdapter;
import com.example.halftime.NewsLoader;
import com.example.halftime.R;

import java.util.ArrayList;
import java.util.List;

public class RBActivity extends AppCompatActivity implements LoaderCallbacks<List<News>> {

    private static final String AMERICAN_EXPRESS_REQUEST_URL = "https://newsapi.org/v2/everything?q=%22Reckitt%20Benckiser%22&language=en&sortBy=relevancy&apiKey=992b068daeb146349573a7d0fae39deb&pageSize=6";
    private static final String LOG_TAG = CompanyAdapter.class.getSimpleName();
    private NewsAdapter articleAdapter;
    private TextView mEmptyStateTextView;


    /**
     * Constant value for the earthquake loader ID. We can choose any integer.
     * This really only comes into play if you're using multiple loaders.
     */
    private static final int NEWS_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_content);

        //create questions list
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("Tell me about a brand that you think is marketed poorly.");
        questions.add("A product was launched a year ago and under-performed its sales goals, what would you do?");
        questions.add("What was your biggest accomplishment in your last role?");
        questions.add("Tell me about how you and your Johnson core team got along. How did you operate? What worked what didn't?");
        questions.add("What is a brand that is not marketed well on social media?");
        questions.add("Why consumer packaged goods?");
        questions.add("Do you want to work in New York City?");
        questions.add("Tell me about a time you used data to drive business.");
        questions.add("What is your favorite store to shop at and why?");

        //Initialize an array adapter
        final ArrayAdapter questionAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);

        //find questions list view
        ListView questionsView = (ListView) findViewById(R.id.questions_list);

        //add questionAdapter to questionsView
        questionsView.setAdapter(questionAdapter);

        //find the listView in the XML
        ListView newsView = (ListView) findViewById(R.id.news_list);

        //Create a list of company objects
        ArrayList<News> articles = new ArrayList<News>();

        //set the news view to empty state text view
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        newsView.setEmptyView(mEmptyStateTextView);

        //initialize a CompanyAdapter
        articleAdapter = new NewsAdapter(this, R.color.white, articles);

        //Checking to see if there is internet connectivity

        ConnectivityManager cm =
                (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();

        if (isConnected == false) {
            ProgressBar loadingCircle = (ProgressBar) findViewById(R.id.loading_circle);
            loadingCircle.setVisibility(View.GONE);
            mEmptyStateTextView.setText(R.string.no_internet);
            return;
        }

        //Set listView with a CompanyAdapter
        newsView.setAdapter(articleAdapter);


        // Get a reference to the LoaderManager, in order to interact with loaders.
        LoaderManager loaderManager = getLoaderManager();


        // Initialize the loader. Pass in the int ID constant defined above and pass in null for
        // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
        // because this activity implements the LoaderCallbacks interface).
        loaderManager.initLoader(NEWS_LOADER_ID, null, this);

        newsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                News clickedNews = (News) articleAdapter.getItem(i);
                String outPut = clickedNews.getmUrl();

                Uri clickedNewsUri = Uri.parse(outPut);
                Intent intent = new Intent(Intent.ACTION_VIEW, clickedNewsUri);
                startActivity(intent);
            }


        });
    }
    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle bundle) {

        return new NewsLoader(this, AMERICAN_EXPRESS_REQUEST_URL);

    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> data){

        articleAdapter.clear();

//        ProgressBar loadingCircle = (ProgressBar) findViewById(R.id.loading_circle);
//        loadingCircle.setVisibility(View.GONE);
//        mEmptyStateTextView.setText(R.string.no_earthquakes);

        if (data != null && !data.isEmpty()) {

            articleAdapter.addAll(data);

        }

    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader){

        articleAdapter.clear();
    }
}
