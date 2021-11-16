package services;

import repositories.CommentRepository;
import model.Comment;
import proxies.CommentNotificationProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

      public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
