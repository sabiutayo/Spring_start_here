package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);
        boolean b1 = cs1 == cs2;
        System.out.println(b1);

    }
}