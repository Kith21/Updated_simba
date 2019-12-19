package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.EmployeeDAO;
import com.example.DAO.EmployeeDAOImpl;
import com.example.model.Employee;


@Repository
@RestController
//@RequestMapping("/customerService")
@CrossOrigin(origins="http://localhost:4200")
public class A_EmployeeRestController {



	@Autowired
	private EmployeeDAOImpl employeeDAOImpl;

	
	@GetMapping("/a_employee")
		public List getEmployee() {

		return employeeDAOImpl.getAllEmployee();

	}
	@GetMapping("/a_superuser")
	public List getSuperuser() {

	return employeeDAOImpl.getAllSuperuser();

}
	@DeleteMapping("/delete/a_employee/{id}")
	public ResponseEntity deleteCustomer(@PathVariable Long id) {
		
		if (null == employeeDAOImpl.deleteEmployee(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	
	
	@PostMapping(value = "/post/a_employee")
	public ResponseEntity createCustomer(@RequestBody Employee employee) {

		System.out.println(employee);
		employeeDAOImpl.registerAdmin(employee);

		return new ResponseEntity(employee, HttpStatus.OK);
	}
	
	@PutMapping("/put/a_employee/{id}")
	public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody Employee employee) {
		System.out.println(id);
		System.out.println(employee);
		employee = employeeDAOImpl.updateAdmin(id, employee);

		if (null == employee) {
			return new ResponseEntity("No Customer found for ID " + id,HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(employee, HttpStatus.OK);
	}
}