package org.example.email;


import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String from, String to, String body) {
        System.out.println("Sending email from:" + from + " to: " + to + " with body: "+ body);
    }
}
