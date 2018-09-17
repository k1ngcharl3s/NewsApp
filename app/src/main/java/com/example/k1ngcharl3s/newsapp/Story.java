package com.example.k1ngcharl3s.newsapp;

public class Story {


        //String variables for list items
        private String title, section, author, relDate, url;

        public Story(String mTitle, String mSection, String mAuthor, String mDate, String mUrl) {
            title = mTitle;
            section = mSection;
            author = mAuthor;
            relDate = mDate;
            url = mUrl;
        }

        public String getStoryTitle() {
            return title;
        }

        public String getStorySection() {
            return section;
        }

    public String getAuthor() {
            return author; }

    public String getStoryDate() {
            return relDate;
        }

        public String getStoryURL() {
            return url;
        }
    }


