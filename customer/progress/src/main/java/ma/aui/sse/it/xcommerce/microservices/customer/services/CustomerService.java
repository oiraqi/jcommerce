package ma.aui.sse.it.xcommerce.microservices.customer.services;

import org.springframework.beans.factory.annotation.Autowired;

import ma.aui.sse.it.xcommerce.microservices.customer.entities.Customer;
import ma.aui.sse.it.xcommerce.microservices.customer.repositories.CustomerRepository;

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