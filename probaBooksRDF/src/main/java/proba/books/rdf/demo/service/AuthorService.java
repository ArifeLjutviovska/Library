package proba.books.rdf.demo.service;

import org.springframework.stereotype.Service;
import proba.books.rdf.demo.DemoApplication;
import proba.books.rdf.demo.model.Author;

import java.util.List;

@Service
public class AuthorService {
    private final List<Author> authors= DemoApplication.authors;

    public List<Author> getAuthors(){
        return this.authors;
    }
}
