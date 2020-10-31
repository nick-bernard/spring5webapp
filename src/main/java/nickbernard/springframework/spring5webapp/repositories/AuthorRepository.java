package nickbernard.springframework.spring5webapp.repositories;

import nickbernard.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nick on Oct, 2020
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
