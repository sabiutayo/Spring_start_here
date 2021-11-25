package main;

import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service = context.getBean(CommentService.class);
        service.publishComment(new Comment().setText("Demo comment").setAuthor("Natasha"));
    }
}