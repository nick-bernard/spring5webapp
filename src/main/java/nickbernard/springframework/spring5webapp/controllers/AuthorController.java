package nickbernard.springframework.spring5webapp.controllers;

import nickbernard.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nick on Nov 1, 2020
 */
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    // Constructor
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authorslist";
    }
}
