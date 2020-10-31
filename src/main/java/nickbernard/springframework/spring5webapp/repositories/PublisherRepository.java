package nickbernard.springframework.spring5webapp.repositories;

import nickbernard.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nick on Oct 31, 2020
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {


}
