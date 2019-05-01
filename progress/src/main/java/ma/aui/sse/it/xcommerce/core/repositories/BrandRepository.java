package ma.aui.sse.it.xcommerce.core.repositories;

import ma.aui.sse.it.xcommerce.core.entities.Brand;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Omar IRAQI
 */
public interface BrandRepository extends CrudRepository<Brand, Long> {

        //List<Brand> findByName(String brand);
}
