package ma.aui.sse.it.xcommerce.core.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;

import ma.aui.sse.it.xcommerce.core.entities.ShoppingCart;
import ma.aui.sse.it.xcommerce.core.repositories.ProductRepository;
import ma.aui.sse.it.xcommerce.core.entities.Product;

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

    @CachePut(value = "ShoppingCart", key = "#shoppingCart.customerId")
    public ShoppingCart putShoppingCart(ShoppingCart shoppingCart){
        return shoppingCart;
    }

    public ShoppingCart addProduct(long customerId, long productId, int quantity){
        ShoppingCart shoppingCart = getShoppingCart(customerId);
        Product product = productRepository.findById(productId).get();
        shoppingCart.addProduct(product, quantity);
        return putShoppingCart(shoppingCart);
    }
}