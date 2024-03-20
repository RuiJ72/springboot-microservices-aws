package com.microservices.aws.codeblog.service;

import com.microservices.aws.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
