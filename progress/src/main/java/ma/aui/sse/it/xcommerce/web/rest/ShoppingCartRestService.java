package ma.aui.sse.it.xcommerce.web.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.aui.sse.it.xcommerce.core.entities.ShoppingCart;
import ma.aui.sse.it.xcommerce.core.services.ShoppingCartService;

/**
 *
 * @author Omar IRAQI
 */
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartRestService {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/get/{customerId}")
    public ShoppingCart getShoppingCart(@PathVariable long customerId){
        return shoppingCartService.getShoppingCart(customerId);
    }

    @GetMapping("/addProduct")
    public ShoppingCart addProduct(@RequestParam long customerId, 
                    @RequestParam long productId, @RequestParam int quantity){
        return shoppingCartService.addProduct(customerId, productId, quantity);
    }

    @GetMapping("/decreaseProductQuantity")
    public ShoppingCart removeProduct(@RequestParam long customerId, 
                    @RequestParam long productId, @RequestParam int quantity){
        return shoppingCartService.removeProduct(customerId, productId, quantity);
    }

    @GetMapping("/removeProduct")
    public ShoppingCart removeProduct(@RequestParam long customerId, 
                    @RequestParam long productId){
        return shoppingCartService.removeProduct(customerId, productId);
    }
}