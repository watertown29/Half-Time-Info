package com.example.halftime;

import android.content.Intent;

public class Company {

    private String mCompanyName;
    private String mCompanyCity;
    private int mImageResource;
    private Intent mActivityResource;

    /**
     * Constructor with String companyName
     * String companyCity
     * int imageResource
     */
    public Company(String companyName, String companyCity, int imageResource, Intent activityResource){
        mCompanyName = companyName;
        mCompanyCity = companyCity;
        mImageResource = imageResource;
        mActivityResource = activityResource;
    }

    /**
     * = the company's name
     */
    public String getmCompanyName(){
        return mCompanyName;
    }

    /**
     * = the city the HQ is located in
     */
    public String getmCompanyCity(){
        return mCompanyCity;
    }

    /**
     * = the image resource value
     */
    public int getmImageResource(){
        return mImageResource;
    }

    /**
     * = the activity resource value
     */
    public Intent getmActivityResource(){return mActivityResource;}
}
