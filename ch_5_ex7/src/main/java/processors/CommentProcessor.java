package processors;

import Model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentProcessor {
    @Autowired
    private CommentRepository repository;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public CommentProcessor setComment(Comment comment) {
        this.comment = comment;
        return this;
    }

    public void processComment(Comment c) {

    }

    public void validateComment(Comment c) {

    }
}
