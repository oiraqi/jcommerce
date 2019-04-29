package ma.aui.sse.it.xcommerce.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.aui.sse.it.xcommerce.core.entities.Order;

/**
 *
 * @author Omar IRAQI
 */
public interface OrderRepository extends MongoRepository<Order, Long>{
    List<Order> findByCustomer();
}