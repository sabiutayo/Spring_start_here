package main;

import main.Repository.DBCommentRepository;
import main.model.Comment;
import main.proxy.EmailCommentNotificationProxy;
import main.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("George");
        comment.setText("Comment test");

        commentService.publishComment(comment);
    }
}