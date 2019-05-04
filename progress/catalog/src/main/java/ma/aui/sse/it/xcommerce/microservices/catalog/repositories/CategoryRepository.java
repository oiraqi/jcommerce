package ma.aui.sse.it.xcommerce.microservices.catalog.repositories;

import org.springframework.data.repository.CrudRepository;

import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Category;

/**
 *
 * @author Omar IRAQI
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
