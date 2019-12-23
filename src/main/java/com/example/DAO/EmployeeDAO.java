package com.example.DAO;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeDAO {
	Employee registerAdmin(Employee employee);
	List<Employee> getAllAdmin();
	List<Employee> getSuperuser();
	Employee get(Long empId);
	String deleteAdmin(String empId);
	Employee updateAdmin(String empId,Employee emp);
	Employee updateSuperuser(String empId,Employee emp);
	Employee updateCustomer(Long acc_no,Employee emp);
}


