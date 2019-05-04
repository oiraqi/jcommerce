package ma.aui.sse.it.xcommerce.core.catalog.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.aui.sse.it.xcommerce.core.catalog.entities.Product;
import ma.aui.sse.it.xcommerce.core.catalog.services.CatalogService;

/**
 *
 * @author Omar IRAQI
 */
@RestController
@RequestMapping("/catalog")
public class CatalogRestService {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/build")
    public Iterable<Product> build(){
        return catalogService.build();
    }
}