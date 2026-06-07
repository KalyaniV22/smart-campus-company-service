package com.companyservice.companyservice;


import java.util.List;

import com.companyservice.dto.CompanyDto;
import com.companyservice.entity.Company;


public interface CompanyService {


	public abstract Company addCompany(CompanyDto compdto);


	public abstract List<Company> getCompany();

}
