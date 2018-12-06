package com.audience.customer.controller;

import com.audience.customer.client.CustomerClient;
import com.audience.customer.model.Customer;
import com.audience.customer.service.CustomerService;
import com.audience.model.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audience/customer")

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerClient customerClient;

    @RequestMapping("/getCompanyByCustomer")
    public Company getCompanyByCustomer(Customer customer){
        Customer c = customerService.getCustomer(customer);
        Company companyInfoById = customerClient.getCompanyInfoById(c.getcId());
        return companyInfoById;
    }
}
