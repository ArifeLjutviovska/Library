package proba.books.rdf.demo.service;

import org.springframework.stereotype.Service;
import proba.books.rdf.demo.DemoApplication;
import proba.books.rdf.demo.model.Author;
import proba.books.rdf.demo.model.Contributor;

import java.util.List;

@Service
public class ContributorService {

    private final List<Contributor> contributors= DemoApplication.contributors;

    public List<Contributor> getContributors(){
        return this.contributors;
    }
}
