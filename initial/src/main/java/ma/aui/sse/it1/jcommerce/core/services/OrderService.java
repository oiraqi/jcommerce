package ma.aui.sse.it1.jcommerce.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it1.jcommerce.core.entities.Order;
import ma.aui.sse.it1.jcommerce.core.repositories.OrderRepository;

/**
 *
 * @author Omar IRAQI
 */
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Order> getOrders(Long customerId) {
        return orderRepository.findByCustomer();
    }
}