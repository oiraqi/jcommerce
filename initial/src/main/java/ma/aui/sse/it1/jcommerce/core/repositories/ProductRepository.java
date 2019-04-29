/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it1.jcommerce.core.repositories;

import ma.aui.sse.it1.jcommerce.core.entities.Product;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Omar IRAQI
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

        //List<Product> findByBrand(String brand);
}
