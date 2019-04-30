package ma.aui.sse.it.xcommerce.web.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.aui.sse.it.xcommerce.core.entities.Product;
import ma.aui.sse.it.xcommerce.core.services.CatalogService;
import ma.aui.sse.it.xcommerce.core.entities.Category;
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

    @GetMapping("/sc")
    public ShoppingCart getSC(){
        return shoppingCartService.getShoppingCart(11);
    }

    @GetMapping("/scm")
    public String getSCM(){
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCart(11);
        shoppingCartService.putShoppingCart(shoppingCart);
        return "Updated!";
    }
}