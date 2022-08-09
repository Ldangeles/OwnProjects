package com.ldangeles;

public class Video {
    private String title;
    private String description;
    private int duration;
    private int owner_id;

    private int ID;

    public Video(String title, String description, int duration, int owner_id) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.owner_id = owner_id;
    }

    public Video(int ID, String title, String description, int duration, int owner_id) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.owner_id = owner_id;
    }

    @Override
    public String toString() {
        return "Video [title= " + title + ", description= " + description + ", duration= "+duration+", username= "+owner_id+"]";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}
