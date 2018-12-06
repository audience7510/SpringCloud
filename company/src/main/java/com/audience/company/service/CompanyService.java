package com.audience.company.service;

import com.audience.company.model.Company;

public interface CompanyService {
    Company getCompanyInfo();

    Company getCompanyInfoById(Integer id);
}
