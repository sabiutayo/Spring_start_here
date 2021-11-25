package services;

import Model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import processors.CommentProcessor;

@Service
public class CommentService {

    @Autowired
    private CommentProcessor commentProcessor;

    public void sendComment(Comment c) {

        commentProcessor.setComment(c);
        commentProcessor.processComment(c);
        commentProcessor.validateComment(c);

        c = commentProcessor.getComment();

    }
}
