package proba.books.rdf.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proba.books.rdf.demo.model.Author;
import proba.books.rdf.demo.service.AuthorService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return this.authorService.getAuthors();
    }
}
