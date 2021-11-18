package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("Before retrieving CommentService");
        var service = context.getBean(CommentService.class);
        System.out.println("After retrieving CommentService");
    }
}