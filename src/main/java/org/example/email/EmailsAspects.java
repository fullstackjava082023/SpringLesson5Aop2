package org.example.email;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmailsAspects {

    @Around("execution(void EmailService.sendEmail(..))")
    public void onSendEmail(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("intercepted");
        boolean validated = validate((String) joinPoint.getArgs()[0], (String) joinPoint.getArgs()[1], (String) joinPoint.getArgs()[2]);
        if (validated) {
            joinPoint.proceed();
        } else {
            System.out.println("email is not correct structured");
        }

    }

    public boolean validate(String from, String to, String body) {
        boolean result = true;
        if (from.isEmpty() || to.isEmpty() || body.isEmpty()) {
            result = false;
        }
        return result;
    }

}
