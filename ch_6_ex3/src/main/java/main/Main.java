package main;

import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    public static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service = context.getBean(CommentService.class);
        String value = service.publishComment(new Comment().setText("Demo comment").setAuthor("Natasha"));

        logger.info(value);
    }
}