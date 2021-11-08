package com.abhisek.bookstore.service;

import com.abhisek.bookstore.model.Author;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Author> getAuthors(){
        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1,"https://techcommunity.microsoft.com/t5/image/serverpage/image-id/217078i525F6A9EF292601F/image-size/large?v=v2&px=999","Test 1","test description 1");

        Author author2 = new Author(2,"https://st2.depositphotos.com/1009634/7235/v/600/depositphotos_72350117-stock-illustration-no-user-profile-picture-hand.jpg","Test 2","test description 2");

        authors.add(author1);
        authors.add(author2);

        return authors;
    }

    public List<Author> searchedAuthors(String name, String profilePicUrl, String description){
        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1,profilePicUrl,name,description);

        authors.add(author1);

        return authors;
    }

    public List<Author> anotherSearchExample(String name){
        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1,"profilePicUrl",name,"description");

        authors.add(author1);

        return authors;
    }
}
