package com.microservices.aws.codeblog.utils;


import com.microservices.aws.codeblog.model.Post;
import com.microservices.aws.codeblog.repository.CodeblogRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Rui Lagos");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Exemplo de cponteúdo de texto");

        Post post2 = new Post();
        post2.setAutor("Jorge  Coutinho");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Segundo exemplo de texto");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
