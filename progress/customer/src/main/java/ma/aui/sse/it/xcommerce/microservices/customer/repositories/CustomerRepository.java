package ma.aui.sse.it.xcommerce.microservices.customer.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.aui.sse.it.xcommerce.microservices.customer.entities.Customer;

/**
 *
 * @author Omar IRAQI
 */
public interface CustomerRepository extends MongoRepository<Customer, Long>{
    
}