package ma.aui.sse.it1.jcommerce.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.aui.sse.it1.jcommerce.core.entities.Customer;

/**
 *
 * @author Omar IRAQI
 */
public interface CustomerRepository extends MongoRepository<Customer, Long>{
    
}