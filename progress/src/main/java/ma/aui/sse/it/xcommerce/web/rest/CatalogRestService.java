package ma.aui.sse.it.xcommerce.web.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class CatalogRestService {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return catalogService.getProducts();
    }

    @GetMapping("/categories")
    public Iterable<Category> getCategories() {
        return catalogService.getCategories();
    }

    @GetMapping("/build")
    public Iterable<Product> build(){
        return catalogService.build();
    }

    @GetMapping("/categories/{categoryId}/products")
    public Iterable<Product> getProductsByCategory(@PathVariable long categoryId){
        return catalogService.getProductsByCategory(categoryId);
    }

    @GetMapping("/brands/{brandId}/products")
    public Iterable<Product> getProductsByBrand(@PathVariable long brandId){
        return catalogService.getProductsByBrand(brandId);
    }
}