package com.example.halftime;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOG_TAG = CompanyAdapter.class.getSimpleName();
    private int backgroundColor;

    /**
     * Constructor
     *
     * @param context the current context
     * @param colorId the color resource Id
     * @param articles a list of objects to display in a list
     */
    public NewsAdapter(Activity context, int colorId, ArrayList<News> articles){
        super(context, colorId, articles);
        backgroundColor = colorId;
    }

    /**
     * provides a view for an AdapterView (ListView GridView, etc.)
     * @param position
     * @param convertView
     * @param parent
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.article_list_item, parent, false);
        }
        News currentArticle = (News) getItem(position);

        /**
         * set backround color to word theme
         */

        LinearLayout themeColor = (LinearLayout) listItemView.findViewById(R.id.theme_color);
        themeColor.setBackgroundResource(backgroundColor);

        /**
         * setText on miwokTextView in company_list_item to int position on the list
         */

        TextView articleDateText = (TextView) listItemView.findViewById(R.id.article_date_text);

        String dateOfArticle = currentArticle.getmDate();
//        Date dateObject = new Date(dateOfArticle);
//        SimpleDateFormat dateFormatter = new SimpleDateFormat("LLL dd, yyyy");
//        String dateToDisplay = dateFormatter.format(dateObject);

//        articleDateText.setText(dateToDisplay);
        articleDateText.setText(dateOfArticle);
        /**
         * setText on defaultTextView in company_list_item to int position on the list
         */

        TextView articleTitleText = (TextView) listItemView.findViewById(R.id.article_title_text);
        articleTitleText.setText(currentArticle.getmTitle());

        return listItemView;

    }

}
