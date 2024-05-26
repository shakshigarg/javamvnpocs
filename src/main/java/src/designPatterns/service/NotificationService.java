package src.designPatterns.service;

import src.designPatterns.entities.Subscriber;

public class NotificationService {
    EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notify(Subscriber subscriber, String message) {
        emailService.sendEmail(subscriber.getEmail(), message);
    }
}
