package com.example.k1ngcharl3s.newsapp;

import android.content.Context;
import android.util.Log;

import java.util.List;
import android.content.AsyncTaskLoader;


public class StoryLoader extends AsyncTaskLoader<List<Story>> {

    private static final String LOG_TAG = StoryLoader.class.getSimpleName();
    private String mUrl;

    public StoryLoader(Context context, String url) {
        super(context);
        mUrl = url;

    }


    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Story> loadInBackground() {
        if (mUrl == null) {
            Log.e(LOG_TAG, "No info from Url.");
            return null;
        }

        List<Story> newsStories = Utils.fetchNewsStories(mUrl);
        return newsStories;
    }
}