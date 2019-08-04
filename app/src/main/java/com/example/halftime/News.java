package com.example.halftime;

import java.net.URL;

public class News {

    private String mTitle;
    private String mDate;
    private String mUrl;

    /**
     * Constructor with String title
     * Long date
     * String url
     */
    public News(String title, String date, String url){
        mTitle = title;
        mDate = date;
        mUrl = url;
    }

    /**
     * = the article's title
     */
    public String getmTitle(){
        return mTitle;
    }

    /**
     * = the date of the article
     */
    public String getmDate(){
        return mDate;
    }

    /**
     * = the image resource value
     */
    public String getmUrl(){
        return mUrl;
    }
}
