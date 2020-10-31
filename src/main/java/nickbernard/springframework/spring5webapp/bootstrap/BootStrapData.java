package nickbernard.springframework.spring5webapp.bootstrap;

import nickbernard.springframework.spring5webapp.domain.Author;
import nickbernard.springframework.spring5webapp.domain.Book;
import nickbernard.springframework.spring5webapp.repositories.AuthorRepository;
import nickbernard.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Oct, 2020
 */
@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    // Constructor
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Blair");
        Book nineteenEightyFour = new Book("1984", "123456789");
        eric.getBooks().add(nineteenEightyFour);
        nineteenEightyFour.getAuthors().add(eric);

        // save the author and the book into the H2 database
        authorRepository.save(eric);
        bookRepository.save(nineteenEightyFour);

        Author god = new Author("Jesus", "Christ");
        Book bible = new Book("The Holy Bible", "666999666");
        god.getBooks().add(bible);
        bible.getAuthors().add(god);

        // again, save to H2 Database
        authorRepository.save(god);
        bookRepository.save(bible);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
