package com.example.blog;

public class ContentModel {
    String title;
    String authorname;
    String date;
    String time;
    int image;

    public ContentModel(String title, String authorname, String date, String time, int image) {
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

    public int getImage() {
        return image;
    }
}
