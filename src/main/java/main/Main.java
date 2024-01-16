package main;

import main.chapter_four.model.Comment;
import main.chapter_four.proxies.EmailCommentNotificationProxy;
import main.chapter_four.repositories.DBCommentRepository;
import main.chapter_four.services.CommentService;


public class Main {

    public static void main(String[] args) {
        var commentRepository =
                new DBCommentRepository();

        var commentNotificationProxy =
                new EmailCommentNotificationProxy();

        var commentService =
                new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}

