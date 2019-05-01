package ma.aui.sse.it.xcommerce.core.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it.xcommerce.core.entities.Brand;
import ma.aui.sse.it.xcommerce.core.entities.Category;
import ma.aui.sse.it.xcommerce.core.entities.Product;
import ma.aui.sse.it.xcommerce.core.repositories.BrandRepository;
import ma.aui.sse.it.xcommerce.core.repositories.CategoryRepository;
import ma.aui.sse.it.xcommerce.core.repositories.ProductRepository;

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

    public Category createCategory(String name, Category parentCategory){
        Category category = new Category(name, parentCategory);
        categoryRepository.save(category);
        return category;
    }

    public Category createCategory(String name){
        return createCategory(name, null);
    }

    public Product createProduct(String name, Brand brand, Category category, float price, int quantity, float weight){
        Product product = new Product(name, brand, category, price, quantity, weight);
        productRepository.save(product);
        return product;
    }

    public Product createProduct(String name, Brand brand, float price, int quantity, float weight){
        return createProduct(name, brand, null, price, quantity, weight);
    }

    public Product createProduct(String name, Category category, float price, int quantity, float weight){
        return createProduct(name, null, category, price, quantity, weight);
    }

    public Product createProduct(String name, float price, int quantity, float weight){
        return createProduct(name, null, null, price, quantity, weight);
    }

    public Iterable<Brand> getBrands() {
        return brandRepository.findAll();
    }

    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }
    
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
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
            createCategory("Phones", rootCategories[0]),
            createCategory("Tabs", rootCategories[0]),
            createCategory("Laptops", rootCategories[0]),
            createCategory("Mountain Bikes", rootCategories[1]),
            createCategory("XR", rootCategories[1]),
            createCategory("Fat Bikes", rootCategories[1])
        };
        Product[] products = {
            createProduct("F1", brands[0], level1Categories[0], 4000, 5, 200),
            createProduct("F3", brands[0], level1Categories[0], 2500, 5, 200),
            createProduct("XHR", brands[1], level1Categories[1], 4000, 5, 200),
        };
        return productRepository.findAll();
    }

    public Iterable<Product> getProductsByCategory(long categoryId){
        return productRepository.findByCategory(categoryRepository.findById(categoryId).get());
    }

    public Iterable<Product> getProductsByBrand(long brandId){
        return productRepository.findByBrand(brandRepository.findById(brandId).get());
    }
}