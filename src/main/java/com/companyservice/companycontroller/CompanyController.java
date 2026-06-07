package com.companyservice.companycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.companyservice.companyserviceimpl.CompanyServiceImpl;
import com.companyservice.dto.CompanyDto;
import com.companyservice.entity.Company;

	@RestController
	@RequestMapping("/campus")
	@CrossOrigin(origins = "*")
	public class CompanyController {
		@Autowired
		private CompanyServiceImpl smartcampusimpl;


		@PostMapping("/addcompany")
		public ResponseEntity<String> addCompanyData(@RequestBody CompanyDto compdto) {
			smartcampusimpl.addCompany(compdto);
			return new ResponseEntity<>("Campnay data Saved!", HttpStatus.CREATED);
		}


		@GetMapping("/getcompany")
		public ResponseEntity<List<Company>> getCompanyData() {
			List<Company> lcomp = smartcampusimpl.getCompany();
			return new ResponseEntity<>(lcomp, HttpStatus.OK);
		}



		@PutMapping("/updatecomp/{name}")
		public String updateCompany(@PathVariable String name, CompanyDto compdto) {
			return smartcampusimpl.updateCompany(name, compdto);
		}

		@DeleteMapping("/dltcomp/{name}")
		public String deleteCompany(@PathVariable String name) {
			return smartcampusimpl.deleteCompany(name);
		}
		
		@GetMapping("/eligiblecompany/{branch}/{cgpa}/{no_of_backlog}")
		List<Integer> findEligibleCompanies(
		        @RequestParam String branch,
		        @RequestParam float cgpa,
		        @RequestParam int no_of_backlog) {

		    return smartcampusimpl.findEligibleCompanies(
		            branch,
		            cgpa,
		            no_of_backlog);
		}		
		@GetMapping("/companybyid/{companyId}")
		public CompanyDto getCompanyById(@PathVariable Integer companyId) {
			return smartcampusimpl.getCompanyById(companyId);
		}


}
