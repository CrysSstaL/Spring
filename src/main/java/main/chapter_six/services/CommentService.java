package main.chapter_six.services;

import main.chapter_six.model.Comment;
import main.chapter_four.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }
}
