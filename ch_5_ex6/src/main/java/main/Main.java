package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service1 = context.getBean(CommentService.class);
        var service2 = context.getBean(UserService.class);
        boolean b1 = service1.getCommentRepository() == service2.getCommentRepository();
        System.out.println(b1);
    }
}