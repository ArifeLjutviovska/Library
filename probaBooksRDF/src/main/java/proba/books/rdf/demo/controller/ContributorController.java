package proba.books.rdf.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proba.books.rdf.demo.model.Contributor;
import proba.books.rdf.demo.service.ContributorService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contributors")
public class ContributorController {

    private final ContributorService contributorService;

    public ContributorController(ContributorService contributorService) {
        this.contributorService = contributorService;
    }

    @GetMapping
    public List<Contributor> getContributors(){
        return this.contributorService.getContributors();
    }
}
