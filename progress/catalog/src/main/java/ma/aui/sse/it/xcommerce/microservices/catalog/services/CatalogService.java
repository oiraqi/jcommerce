package ma.aui.sse.it.xcommerce.microservices.catalog.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Brand;
import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Category;
import ma.aui.sse.it.xcommerce.microservices.catalog.entities.Product;
import ma.aui.sse.it.xcommerce.microservices.catalog.repositories.BrandRepository;
import ma.aui.sse.it.xcommerce.microservices.catalog.repositories.CategoryRepository;
import ma.aui.sse.it.xcommerce.microservices.catalog.repositories.ProductRepository;

/**
 *
 * @author Omar IRAQI
 */
@Service
public class CatalogService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    public Brand createBrand(String name){
        Brand brand = new Brand(name);
        brandRepository.save(brand);
        return brand;
    }

    public Category createCategory(String name, long parentCategoryId){
        Category category = new Category(name, categoryRepository.findById(parentCategoryId).get());
        categoryRepository.save(category);
        return category;
    }

    public Category createCategory(String name){
        Category category = new Category(name, null);
        categoryRepository.save(category);
        return category;
    }

    public Product createProduct(String name, long brandId, long categoryId, float price, int quantity, float weight){
        Product product = new Product(name, brandRepository.findById(brandId).get(), 
                                categoryRepository.findById(categoryId).get(), price, quantity, weight);
        productRepository.save(product);
        return product;
    }

    public Iterable<Product> build(){
        productRepository.deleteAll();
        brandRepository.deleteAll();
        categoryRepository.deleteAll();

        Brand[] brands  = { 
            createBrand("Oppo"), 
            createBrand("Samsung"), 
            createBrand("Huwawei"),
            createBrand("Apple"),
            createBrand("Specialized"),
            createBrand("Scott")
        };
        Category[] rootCategories = {
            createCategory("Electronics"),
            createCategory("Bikes")
        };
        Category[] level1Categories = {
            createCategory("Phones", rootCategories[0].getId()),
            createCategory("Tabs", rootCategories[0].getId()),
            createCategory("Laptops", rootCategories[0].getId()),
            createCategory("Mountain Bikes", rootCategories[1].getId()),
            createCategory("XR", rootCategories[1].getId()),
            createCategory("Fat Bikes", rootCategories[1].getId())
        };
        Product[] products = {
            createProduct("F1", brands[0].getId(), level1Categories[0].getId(), 4000, 5, 200),
            createProduct("F3", brands[0].getId(), level1Categories[0].getId(), 2500, 5, 200),
            createProduct("XHR", brands[1].getId(), level1Categories[1].getId(), 4000, 5, 200),
            //createProduct("Spark", brands[5], level1Categories[3], 15000, 2, 4200),
        };
        return productRepository.findAll();
    }
}