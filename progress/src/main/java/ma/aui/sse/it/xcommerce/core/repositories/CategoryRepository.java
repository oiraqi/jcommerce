package ma.aui.sse.it.xcommerce.core.repositories;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import ma.aui.sse.it.xcommerce.core.entities.Category;

/**
 *
 * @author Omar IRAQI
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

        List<Category> findByName(String name);
}
