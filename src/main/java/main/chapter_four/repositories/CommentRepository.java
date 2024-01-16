package main.chapter_four.repositories;

import main.chapter_four.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
