package repositories;

import model.Comment;
import org.springframework.stereotype.Service;

@Service
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
