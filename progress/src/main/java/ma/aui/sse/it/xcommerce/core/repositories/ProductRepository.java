/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it.xcommerce.core.repositories;

import ma.aui.sse.it.xcommerce.core.entities.Product;
import ma.aui.sse.it.xcommerce.core.entities.Brand;
import ma.aui.sse.it.xcommerce.core.entities.Category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Omar IRAQI
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

        List<Product> findByBrand(Brand brand);
        List<Product> findByCategory(Category category);
}
