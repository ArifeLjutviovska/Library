package proba.books.rdf.demo.service;

import org.apache.jena.base.Sys;
import org.springframework.stereotype.Service;
import proba.books.rdf.demo.DemoApplication;
import proba.books.rdf.demo.model.Author;
import proba.books.rdf.demo.model.Book;
import proba.books.rdf.demo.model.Contributor;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<Book> books= DemoApplication.books;
    private final List<Author> authors= DemoApplication.authors;
    private final List<Contributor> contributors= DemoApplication.contributors;

    public BookService() {
    }

   public List<Book> getBooks(){
        return this.books;
   }
   public Book getOneBook(String name){
        return this.books.stream().filter(b->b.getName().equals(name)).findAny().orElse(null);
   }

}
