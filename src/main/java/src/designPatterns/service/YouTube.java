package src.designPatterns.service;

import src.designPatterns.entities.Publisher;
import src.designPatterns.entities.Subscriber;
import src.designPatterns.entities.Video;
import src.designPatterns.utils.YouTubeServiceUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YouTube {
    NotificationService notificationService;
    HashMap<Publisher, List<Subscriber>> pubSubMap = new HashMap<Publisher, List<Subscriber>>();

    public YouTube(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addPublisher(Publisher p) {
        if (pubSubMap.containsKey(p)) {
            System.out.println("Publisher already exist!");
        } else {
            pubSubMap.put(p, new ArrayList<Subscriber>());
        }
    }

    public void addSubscriber(Publisher p, Subscriber s) {
        if (pubSubMap.containsKey(p)) {
            pubSubMap.get(p).add(s);
            return;
        }
        System.out.println("Publisher not exist!");
    }

    public void uploadVideo(Publisher p, Video v) {
        p.getVideos().add(v);
        for (Subscriber s : pubSubMap.get(p)) {
            notificationService.notify(s, YouTubeServiceUtils.createMessage(p, v));
        }
    }

}
