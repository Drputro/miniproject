package com.eksad.miniproject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eksad.miniproject.model.Employee;
import com.eksad.miniproject.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	//GetAll
	@GetMapping("getAll")
	public List<Employee> getAll(){
		List<Employee> result = new ArrayList<>();
		employeeRepository.findAll().forEach(result::add);
		return result;
	}
	//SAVE-INSERT-DELETE
	@PostMapping(value= "/save")
	public Employee save (@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}
	@DeleteMapping(value = "/delete/{id}")
	public HashMap<String, Object> delete (@PathVariable Long id)
	{
		HashMap<String, Object> result = new HashMap<String, Object>();
		employeeRepository.deleteById(id);
		result.put("message","succesfully delete");
		return result;
	}
	@PutMapping(value = "/update/{id}")
	public Employee update (@RequestBody Employee employee, @PathVariable Long id)
	{
		Employee employeeSelected = employeeRepository.findById(id).orElse(null);
		if(employeeSelected != null)
		{
			employeeSelected.setName(employee.getName());
			employeeSelected.setDob(employee.getDob());
			employeeSelected.setAddress(employee.getAddress());
			employeeSelected.setPhone(employee.getPhone());
			employeeSelected.setAge(employee.getAge());
			employeeSelected.setPob(employee.getPob());
			employeeSelected.setSalary(employee.getSalary());
			employeeSelected.setId_div(employee.getId_div());
			
			return employeeRepository.save(employeeSelected);
		}
		else {
			return null;
		}
	}
	

}