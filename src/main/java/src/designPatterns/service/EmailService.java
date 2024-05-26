package src.designPatterns.service;

public class EmailService {
    public void sendEmail(String email, String message){
        System.out.println("Email sent to "+email+" : " +message);
    }
}
