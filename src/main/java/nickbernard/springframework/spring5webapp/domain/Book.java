package nickbernard.springframework.spring5webapp.domain;

import java.util.Set;

/**
 * Created by nick on Oct, 2020
 */

public class Book {

    private String title;
    private String isbn;
    private Set<Author> authors;

    // 0-arg constructor, as is required by JPA
    public Book() {
    }

    // regular constructor
    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    // getters and setters (next 6 functions)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
