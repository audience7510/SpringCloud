package com.audience.customer.service;

import com.audience.customer.model.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {
    Customer getCustomer(Customer customer);
}
