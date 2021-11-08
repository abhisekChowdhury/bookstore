package com.abhisek.bookstore;

import com.abhisek.bookstore.model.Author;
import com.abhisek.bookstore.model.Inquiry;
import com.abhisek.bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry",new Inquiry());
        model.addAttribute("author", new Author());
        return "index";
    }

    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("authors",homeService.getAuthors());
        return "author";
    }

//    @PostMapping("/author")
//    public String searchAuthor1(Model model, @ModelAttribute Inquiry inquiry){
//
//        String authorName = inquiry.getSearchString();
//
//        model.addAttribute("authors",homeService.anotherSearchExample(authorName));
//        return "author";
//    }

    @PostMapping("/author")
    public String searchAuthor(Model model, @ModelAttribute Author author){

        String name = author.getName();
        String profilePicUrl = author.getProfilePicUrl();
        String description = author.getDescription();

        System.out.println(name +" "+profilePicUrl+" "+description);
        model.addAttribute("authors",homeService.searchedAuthors(name,profilePicUrl,description));

//        System.out.println(inquiry.getSearchString());
//        String authorName = inquiry.getSearchString();
//        model.addAttribute("inquiry", homeService.anotherSearchExample(authorName));
        return "author";
    }

//    @PostMapping("/author")
//    public String anotherSearchAuthorExample(Model model, @ModelAttribute Inquiry inquiry){
//        System.out.println(inquiry.getSearchString());
//        String authorName = inquiry.getSearchString();
//        model.addAttribute("inquiry", homeService.anotherSearchExample(authorName));
//        return "author";
//    }
}
