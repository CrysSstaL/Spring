package main.chapter_four.services;

import main.chapter_four.model.Comment;
import main.chapter_four.proxies.CommentNotificationProxy;
import main.chapter_four.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
