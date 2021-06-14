package com.learning.redditclone.repositories;

import com.learning.redditclone.models.Comment;
import com.learning.redditclone.models.Post;
import com.learning.redditclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}