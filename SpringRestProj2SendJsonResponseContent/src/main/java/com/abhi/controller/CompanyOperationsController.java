package com.abhi.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Company;
import com.abhi.entity.Employee;
import com.abhi.entity.ErrorDetails;

@RestController
@RequestMapping("/company")
public class CompanyOperationsController {

	@GetMapping("/show")
//	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> showCompanyDetails() {
		Company company = new Company("HCL", "Huderabad", "IT", 10000, 23456.679);
		Employee emp = new Employee("Abhijeet",1234, new String[] {"Black,Greeen"},
				   List.of("Kalu","Mintu"),Set.of(346583674L,65677467883L),
				   Map.of("aadhar",56736L,"voterID",985464358L),false,LocalDateTime.of(1990, 10,12,13,30),company
				);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@GetMapping("/without")
//	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Employee show() {
		/*
		 * Company company = new Company("HCL", "Huderabad", "IT", 10000, 23456.679);
		 * return company;
		 */
		Company company = new Company("HCL", "Huderabad", "IT", 10000, 23456.679);
		Employee emp = new Employee("Abhijeet",1234, new String[] {"Black,Greeen"},
				   List.of("Kalu","Mintu"),Set.of(346583674L,65677467883L),
				   Map.of("aadhar",56736L,"voterID",985464358L),false,LocalDateTime.of(1990, 10,12,13,30),company
				);
		return emp;
	}
	
	@PostMapping("/register")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public String registerCompany(@RequestBody Company stu) {
		try {
			System.out.println("Company Value ::"+stu);
			return "Success";
		}catch(Exception e) {
			return e.getMessage();
			}
	}
	
	@PostMapping("/registerEmp")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public String registerEmployee(@RequestBody Employee emp) {
		try {
			System.out.println("Company Value ::"+emp);
			return "Success";
		}catch(Exception e) {
			return e.getMessage();
			}
	}
//	@GetMapping("/requestparam")
	@PostMapping("/requestparam")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> requestParam(@RequestParam(required = false) Integer sno,@RequestParam String sname) throws Exception{
		System.out.println("Sno ::"+sno);
		if(sno!=0) {
			throw new Exception("Hello Exception is raised");
		}
		if(sno==0) {
			throw new NumberFormatException("Hello NumberFormateException is Raised");
		}
		System.out.println("sname ::"+sname);
		return new ResponseEntity<String>(sno+" "+sname,HttpStatus.OK);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails>handleAllEnception(Exception e){
		ErrorDetails error = new ErrorDetails(e.getMessage(),"500",LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<ErrorDetails>handleNumberFormatException(NumberFormatException e){
		ErrorDetails error = new ErrorDetails(e.getMessage(),"500",LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
