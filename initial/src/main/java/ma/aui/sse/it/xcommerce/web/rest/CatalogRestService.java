package ma.aui.sse.it.xcommerce.web.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.aui.sse.it.xcommerce.core.entities.Product;
import ma.aui.sse.it.xcommerce.core.services.CatalogService;
import ma.aui.sse.it.xcommerce.core.entities.Category;

/**
 *
 * @author Omar IRAQI
 */
@RestController
@RequestMapping("/catalog")
public class CatalogRestService extends CatalogService{

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return super.getProducts();
    }

    @GetMapping("/categories")
    public Iterable<Category> getCategories() {
        return super.getCategories();
    }

}