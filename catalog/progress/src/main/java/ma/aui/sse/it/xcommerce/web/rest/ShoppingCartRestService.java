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

    @GetMapping("/get")
    public ShoppingCart getShoppingCart(){
        //retrieve customer from JWT
        long customerId = 1234; // To be removed
        return shoppingCartService.getShoppingCart(customerId);
    }

    @GetMapping("/addProduct")
    public ShoppingCart addProduct(@RequestParam long productId, 
                        @RequestParam int quantity){
        //retirve customerId from JWT
        long customerId = 1234; // To be removed
        return shoppingCartService.addProduct(customerId, productId, quantity);
    }

    @GetMapping("/decreaseProductQuantity")
    public ShoppingCart removeProduct(@RequestParam long productId, 
                        @RequestParam int quantity){
        //retirve customerId from JWT
        long customerId = 1234; // To be removed
        return shoppingCartService.removeProduct(customerId, productId, quantity);
    }

    @GetMapping("/removeProduct")
    public ShoppingCart removeProduct(@RequestParam long productId){
        //retirve customerId from JWT
        long customerId = 1234; // To be removed
        return shoppingCartService.removeProduct(customerId, productId);
    }
}