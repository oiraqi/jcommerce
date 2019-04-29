package ma.aui.sse.it1.jcommerce.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it1.jcommerce.core.entities.Customer;
import ma.aui.sse.it1.jcommerce.core.repositories.CustomerRepository;

/**
 *
 * @author Omar IRAQI
 */
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}