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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static String readTime(String post) {
        int wordPerMinute = 200;
        int noOfWords = post.split("\\s+").length;
        double minutes = (double) noOfWords / wordPerMinute;
        int roundedMinutes = (int) Math.ceil(minutes);

        String minuteOrMinutes = roundedMinutes == 1 ? "minute" : "minutes";
        return roundedMinutes + " " + minuteOrMinutes + " read";
    }
}
