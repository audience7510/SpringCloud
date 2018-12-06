package com.audience.customer.client;

import com.audience.model.company.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "company-service")
public interface CustomerClient {

    @RequestMapping("/audience/company/getCompanyInfoById")
    Company getCompanyInfoById(@RequestParam("id") Integer id);
}
