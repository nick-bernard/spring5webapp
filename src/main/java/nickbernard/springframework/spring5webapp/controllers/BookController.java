package nickbernard.springframework.spring5webapp.controllers;

import nickbernard.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nick on Nov 1, 2020
 */

@Controller
public class BookController {

    private final BookRepository bookRepository;

    // Constructor
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        // At runtime, when spring gets a request to this URL, it's going to execute the getBooks method,
        // it will provide that method with a model object, and for that model we're going to add
        // the books attribute, and with the bookRepository.findAll() method we'll get a list of
        // books. This model will get returned back to the view layer.
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
