package main;

import Model.Comment;
import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service = context.getBean(CommentService.class);
        service.sendComment(new Comment());
        service.sendComment(new Comment());

        Arrays.stream(context.getBeanDefinitionNames()).forEach(x-> System.out.println(x));
    }
}