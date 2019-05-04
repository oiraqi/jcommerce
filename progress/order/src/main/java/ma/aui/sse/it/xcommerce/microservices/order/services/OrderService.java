package ma.aui.sse.it.xcommerce.microservices.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Hashtable;

import ma.aui.sse.it.xcommerce.microservices.order.entities.Order;
import ma.aui.sse.it.xcommerce.microservices.order.entities.Product;
import ma.aui.sse.it.xcommerce.microservices.order.repositories.OrderRepository;

/**
 *
 * @author Omar IRAQI
 */
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrdersByCustomer(String customer) {
        return orderRepository.findByCustomer();
    }

    public void checkout(String customer, Hashtable<Product, Integer> selectedProducts) {
        if(customer == null || selectedProducts == null)
            return;
        
        new Order(customer, selectedProducts);
    }
}