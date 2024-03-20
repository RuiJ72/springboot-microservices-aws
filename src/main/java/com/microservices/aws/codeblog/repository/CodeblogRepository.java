package com.microservices.aws.codeblog.repository;

import com.microservices.aws.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
