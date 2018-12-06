package com.audience.customer.service.impl;

import com.audience.customer.mapper.CustomerMapper;
import com.audience.customer.model.Customer;
import com.audience.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomer(Customer customer) {
        return customerMapper.getCustomer(customer);
    }
}
