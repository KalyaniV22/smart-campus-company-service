package com.companyservice.companyserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyservice.companyrepository.CompanyRepository;
import com.companyservice.companyservice.CompanyService;
import com.companyservice.dto.CompanyDto;
import com.companyservice.entity.Company;
import com.companyservice.feignclient.StudentInterface;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepository companyrepo;
	@Autowired
    private StudentInterface studentrepo;

	@Override
	public Company addCompany(CompanyDto compdto) {

		Company comp = new Company();
		comp.setName(compdto.getName());
		comp.setBacklogcriteria(compdto.getBacklogcriteria());
		comp.setBranchcriteria(compdto.getBranchcriteria());
		comp.setCgpacriteria(compdto.getCgpacriteria());

		Company savedCompany = companyrepo.save(comp);
	    studentrepo.refreshEligibility(); // 🔥 trigger update
		return savedCompany;
	}

	@Override
	public List<Company> getCompany() {
		List<Company> clist = companyrepo.findAll();
		return clist;
	}


	public String updateCompany(String name, CompanyDto compdto) {
		Company comp = companyrepo.findByName(name);
		comp.setName(compdto.getName());
		comp.setBacklogcriteria(compdto.getBacklogcriteria());
		comp.setBranchcriteria(compdto.getBranchcriteria());
		comp.setCgpacriteria(compdto.getCgpacriteria());
		companyrepo.save(comp);
		String msg = "COMPANY UPDATED!";
		return msg;
	}

	public String deleteCompany(String name) {


		    Company comp = companyrepo.findByName(name);


		    companyrepo.delete(comp);
		    studentrepo.refreshEligibility(); 
		    return "COMPANY DELETED!";
		}	
    public List<Integer> findEligibleCompanies(
            String branch,
            float cgpa,
            int no_of_backlog) {

        return companyrepo.findEligibleCompanies(
                branch,
                cgpa,
                no_of_backlog);
    }
	
	public CompanyDto getCompanyById(Integer companyId) {

	    Company company = companyrepo.findById(companyId)
	            .orElseThrow(() -> new RuntimeException("Company not found"));

	    CompanyDto dto = new CompanyDto();
	    dto.setName(company.getName());
	    dto.setBranchcriteria(company.getBranchcriteria());
	    dto.setCgpacriteria(company.getCgpacriteria());
	    dto.setBacklogcriteria(company.getBacklogcriteria());

	    return dto;
	}	
	
}
