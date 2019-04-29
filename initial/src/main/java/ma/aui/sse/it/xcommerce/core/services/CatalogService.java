package ma.aui.sse.it.xcommerce.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it.xcommerce.core.entities.Product;
import ma.aui.sse.it.xcommerce.core.entities.Category;
import ma.aui.sse.it.xcommerce.core.repositories.ProductRepository;
import ma.aui.sse.it.xcommerce.core.repositories.CategoryRepository;

/**
 *
 * @author Omar IRAQI
 */
public class CatalogService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }

}