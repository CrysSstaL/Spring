package main;

import config.ProjectConfig;
import main.chapter_four.model.Comment;
import main.chapter_four.proxies.EmailCommentNotificationProxy;
import main.chapter_four.repositories.DBCommentRepository;
import main.chapter_four.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = c.getBean("commentService", CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);
        boolean b1 = cs1 == cs2;
        System.out.println(b1);
    }
}

