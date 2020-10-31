package nickbernard.springframework.spring5webapp.repositories;

import nickbernard.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nick on Oct, 2020
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
