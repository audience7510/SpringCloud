package com.audience.company.mapper;

import com.audience.company.model.Company;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    Company getCompanyInfo();

    Company getCompanyInfoById(@Param("id") Integer id);
}
