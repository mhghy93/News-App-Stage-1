package com.example.android.newsapp;

public class News {

    /**
     * Title of the news article
     */
    private String mTitle;

    /**
     * Section name of the news
     */
    private String mSectionName;

    /**
     * Date in which the news article was published
     */
    private String mDatePublished;

    /**
     * Website Url of the news article
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title         is the title of the news article
     * @param sectionName   is the section name of the news article
     * @param datePublished is the date in which the news article was published
     * @param url           is the website URL to find more details about the news article
     */
    public News(String title, String sectionName, String datePublished, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mDatePublished = datePublished;
        mUrl = url;
    }

    /**
     * Returns the title of the news article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section name of the news article
     */
    public String getSectionName() {
        return mSectionName;
    }


    /**
     * Returns the date in which the news article was published
     */
    public String getDatePublished() {
        return mDatePublished;
    }

    /**
     * Returns the website url to find more information about the news article
     */
    public String getUrl() {
        return mUrl;
    }
}
