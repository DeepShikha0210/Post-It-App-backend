package com.learning.redditclone.repositories;

import com.learning.redditclone.models.Post;
import com.learning.redditclone.models.Subreddit;
import com.learning.redditclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}