package com.learning.redditclone.exceptions;

public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String s) {

        super(s);
    }
}
