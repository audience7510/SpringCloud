package com.audience.company.controller;

import com.audience.company.model.Company;
import com.audience.company.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audience/company")
public class CompanyController {
    private final static Logger logger= LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/getCompanyInfo")
    public Company getCompanyInfo(){
        return companyService.getCompanyInfo();
    }
}
