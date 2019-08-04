package com.example.halftime;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();

    /** Query URL*/
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null) {

            return null;


        }

        List<News> articles = QueryUtils.fetchNewsData(mUrl);

        return articles;
    }
}
