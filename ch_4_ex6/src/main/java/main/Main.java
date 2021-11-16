package main;

import configuration.ProjectConfiguration;
import model.Comment;
import services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        var commentService = context.getBean(CommentService.class);
        comment.setAuthor("George");
        comment.setText("Comment test");

        commentService.publishComment(comment);
    }
}