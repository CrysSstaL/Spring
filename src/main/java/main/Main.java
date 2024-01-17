package main;

import config.ProjectConfig;
import main.chapter_four.model.Comment;
import main.chapter_four.proxies.EmailCommentNotificationProxy;
import main.chapter_four.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the CommentService");
        var service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}

