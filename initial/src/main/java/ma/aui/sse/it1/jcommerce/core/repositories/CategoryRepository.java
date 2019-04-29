/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.aui.sse.it1.jcommerce.core.repositories;

import ma.aui.sse.it1.jcommerce.core.entities.Category;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Omar IRAQI
 */
//@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface CategoryRepository extends CrudRepository<Category, Long> {

        //List<Product> findByBrand(String brand);
}
