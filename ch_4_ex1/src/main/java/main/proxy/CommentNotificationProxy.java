package main.proxy;

import main.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
