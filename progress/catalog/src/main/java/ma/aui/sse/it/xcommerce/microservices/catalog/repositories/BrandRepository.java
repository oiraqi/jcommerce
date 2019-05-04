package ma.aui.sse.it.xcommerce.microservices.catalog.repositories;

import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Brand;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Omar IRAQI
 */
public interface BrandRepository extends CrudRepository<Brand, Long> {
    
}
