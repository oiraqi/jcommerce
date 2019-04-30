package ma.aui.sse.it.xcommerce.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it.xcommerce.core.entities.Order;
import ma.aui.sse.it.xcommerce.core.entities.ShoppingCart;
//import ma.aui.sse.it.xcommerce.core.repositories.OrderRepository;

/**
 *
 * @author Omar IRAQI
 */
public class OrderService {

    /*@Autowired
    private OrderRepository orderRepository;

    public Iterable<Order> getOrders(Long customerId) {
        return orderRepository.findByCustomer();
    }*/

    /*public void checkout(ShoppingCart shoppingCart){
        if(shoppingCart.isEmpty() || shoppingCart.getCustomerId() < 0)
            return;
        new Order(shoppingCart.getCustomerId())
        shippingCost = shippingCost + BASE_SHIPPING_COST;
        //create order and add it to the customer's list of orders
        //new Order(customer, selectedProducts, productsTotalPrice, shippingCost);
        //empty shopping cart for next order, by calling private method empty()
        shoppingCart.empty();
    }*/
}