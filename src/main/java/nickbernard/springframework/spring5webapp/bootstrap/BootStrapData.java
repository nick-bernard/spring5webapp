package nickbernard.springframework.spring5webapp.bootstrap;

import nickbernard.springframework.spring5webapp.domain.Author;
import nickbernard.springframework.spring5webapp.domain.Book;
import nickbernard.springframework.spring5webapp.domain.Publisher;
import nickbernard.springframework.spring5webapp.repositories.AuthorRepository;
import nickbernard.springframework.spring5webapp.repositories.BookRepository;
import nickbernard.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by nick on Oct, 2020
 */
@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    // Constructor
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("Flatiron Press");
        publisher.setAddress("5th avenue");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setZip("10011");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

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

        System.out.println("Number of Books: " + bookRepository.count());
    }
}
