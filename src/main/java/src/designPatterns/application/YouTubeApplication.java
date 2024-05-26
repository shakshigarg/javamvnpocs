package src.designPatterns.application;

import src.designPatterns.entities.Publisher;
import src.designPatterns.entities.Subscriber;
import src.designPatterns.entities.Video;
import src.designPatterns.service.EmailService;
import src.designPatterns.service.NotificationService;
import src.designPatterns.service.YouTube;

public class YouTubeApplication {
    public static void main(String[] args){
        EmailService emailService=new EmailService();
        NotificationService notificationService=new NotificationService(emailService);
        YouTube youTube=new YouTube(notificationService);
        Publisher p=new Publisher("Sakshi");
        Subscriber subscriber1=new Subscriber("Vansh","vansh@gmail.com");
        Subscriber subscriber2=new Subscriber("Saki","saki@gmail.com");
        Subscriber subscriber3=new Subscriber("Mahi","mahi@gmail.com");
        youTube.addPublisher(p);
        youTube.addSubscriber(p,subscriber1);
        youTube.addSubscriber(p,subscriber3);
        youTube.addSubscriber(p,subscriber2);
        youTube.uploadVideo(p,new Video("design patterns"));

    }
}
