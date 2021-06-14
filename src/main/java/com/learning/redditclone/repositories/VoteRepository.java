package com.learning.redditclone.repositories;

import com.learning.redditclone.models.Post;
import com.learning.redditclone.models.User;
import com.learning.redditclone.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}