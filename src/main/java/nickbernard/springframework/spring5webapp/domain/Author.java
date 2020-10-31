package nickbernard.springframework.spring5webapp.domain;

/**
 * Created by Nick Bernard on October 31st, 2020
 */

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    // 0-Args Constructor, as is required by JPA
    public Author() {
    }

    // Constructor
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }


    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
