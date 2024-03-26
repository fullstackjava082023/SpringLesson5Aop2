package org.example.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmail {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmailAppConfig.class);
        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendEmail("Arja", "John", "Hi John how are you?");
        emailService.sendEmail("Ilia", "", "New Email");


//

    }
}
