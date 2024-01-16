package main;

import config.ProjectConfig;
import main.chapter_four.model.Comment;
import main.chapter_four.proxies.EmailCommentNotificationProxy;
import main.chapter_four.repositories.DBCommentRepository;
import main.chapter_four.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        var comment = new Comment();

        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}

