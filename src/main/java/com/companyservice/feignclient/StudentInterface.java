package com.companyservice.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.companyservice.dto.StudentDto;
import com.companyservice.dto.StudentUpdateDto;

@FeignClient("StudentService")
public interface StudentInterface {

	@PostMapping("campus/addstd")
	public ResponseEntity<String> addStudentData(@RequestBody StudentDto stddto);

	@GetMapping("campus/getstd")
	public ResponseEntity<List<StudentDto>> getStudentData();

	@GetMapping("campus/std/{id}")
	public String getStudentCompanies(@PathVariable int id);

	@PutMapping("campus/updatestd/{email}")
	public String updateStd(@PathVariable String email, StudentUpdateDto stddto);

	@GetMapping("campus/std")
	List<StudentDto> findAll();

	@PostMapping("campus/save")
	void save(@RequestBody StudentDto student);

	@PostMapping("/campus/refresh-eligibility")
	void refreshEligibility();

}
