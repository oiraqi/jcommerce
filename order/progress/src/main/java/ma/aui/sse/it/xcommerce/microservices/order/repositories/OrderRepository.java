package ma.aui.sse.it.xcommerce.microservices.order.repositories;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import ma.aui.sse.it.xcommerce.microservices.order.entities.Order;

/**
 *
 * @author Omar IRAQI
 */
public interface OrderRepository extends Neo4jRepository<Order, Long>{
    List<Order> findByCustomer();
}