package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service1 = context.getBean(CommentService.class);
        var service2 = context.getBean(CommentService.class);
        boolean b1 = service1 == service2;
        System.out.println(b1);
    }
}