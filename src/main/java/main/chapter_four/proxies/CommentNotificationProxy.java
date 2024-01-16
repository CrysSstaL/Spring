package main.chapter_four.proxies;

import main.chapter_four.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
