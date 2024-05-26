package src.designPatterns.utils;

import com.sun.deploy.util.StringUtils;
import src.designPatterns.entities.Publisher;
import src.designPatterns.entities.Subscriber;
import src.designPatterns.entities.Video;

import java.util.HashMap;
import java.util.List;

public class YouTubeServiceUtils {
    public static boolean isPublisherExist(HashMap<Publisher, List<Subscriber>> pubSubMap, Publisher p){
        return true;
    }

    public static String createMessage(Publisher p, Video v) {
        return new StringBuilder().append("Publisher ").append(p.getName()).append("Uploaded Video").append(v.getId()).toString();
    }
}
