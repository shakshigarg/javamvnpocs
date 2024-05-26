package src.designPatterns.entities;

import java.util.ArrayList;

public class Publisher {
    String name;
    ArrayList<Video> videos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public Publisher(String name) {
        this.name = name;
        this.videos=new ArrayList<Video>();
    }
}
