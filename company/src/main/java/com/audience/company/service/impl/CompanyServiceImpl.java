package com.audience.company.service.impl;

import com.audience.company.mapper.CompanyMapper;
import com.audience.company.model.Company;
import com.audience.company.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final static Logger logger= LoggerFactory.getLogger(CompanyServiceImpl.class);

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public Company getCompanyInfo() {
        Company company = companyMapper.getCompanyInfo();
        logger.info(company.toString());
        return company;
    }
}
