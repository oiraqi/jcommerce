package ma.aui.sse.it.xcommerce.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.aui.sse.it.xcommerce.core.entities.Customer;

/**
 *
 * @author Omar IRAQI
 */
public interface CustomerRepository extends MongoRepository<Customer, Long>{
    
}