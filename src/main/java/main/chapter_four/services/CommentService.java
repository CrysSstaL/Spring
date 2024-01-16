package main.chapter_four.services;

import main.chapter_four.model.Comment;
import main.chapter_four.proxies.CommentNotificationProxy;
import main.chapter_four.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
