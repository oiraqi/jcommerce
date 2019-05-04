package ma.aui.sse.it.xcommerce.microservices.catalog.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;

import ma.aui.sse.it.xcommerce.microservices.catalog.entities.ShoppingCart;
import ma.aui.sse.it.xcommerce.microservices.catalog.repositories.ProductRepository;
import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Product;

/**
 *
 * @author Omar IRAQI
 */
@Service
public class ShoppingCartService {

    @Autowired
    private ProductRepository productRepository;

    @Cacheable(value = "ShoppingCart")
    public ShoppingCart getShoppingCart(long customerId){
        return new ShoppingCart(customerId);
    }

    @CachePut(value = "ShoppingCart", key = "#customerId")
    public ShoppingCart addProduct(long customerId, long productId, int quantity){
        ShoppingCart shoppingCart = getShoppingCart(customerId);
        Product product = productRepository.findById(productId).get();
        shoppingCart.addProduct(product, quantity);
        return shoppingCart;
    }

    @CachePut(value = "ShoppingCart", key = "#customerId")
    public ShoppingCart removeProduct(long customerId, long productId, int quantity){
        ShoppingCart shoppingCart = getShoppingCart(customerId);
        Product product = productRepository.findById(productId).get();
        shoppingCart.removeProduct(product, quantity);
        return shoppingCart;
    }

    @CachePut(value = "ShoppingCart", key = "#customerId")
    public ShoppingCart removeProduct(long customerId, long productId){
        ShoppingCart shoppingCart = getShoppingCart(customerId);
        Product product = productRepository.findById(productId).get();
        shoppingCart.removeProduct(product);
        return shoppingCart;
    }
}