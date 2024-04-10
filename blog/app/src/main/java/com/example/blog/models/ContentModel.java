package com.example.blog.models;

public class ContentModel {
    String title;
    String authorname;
    String date;
    String time;
    String id;
    String userId;
    String image;



    public ContentModel(String title, String authorname, String date, String time, String image) {
        this.title = title;
        this.authorname = authorname;
        this.date = date;
        this.time = time;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getImage() {
        return image;
    }
}
