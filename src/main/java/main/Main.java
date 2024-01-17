package main;

import config.ProjectConfig;
import main.chapter_four.model.Comment;
import main.chapter_four.proxies.EmailCommentNotificationProxy;
import main.chapter_four.services.CommentService;
import main.chapter_four.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(
                ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean b =
                s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}

