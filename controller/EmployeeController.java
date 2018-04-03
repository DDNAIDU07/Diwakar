package info.inetsolv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import info.inetsolv.Entity.Employee;
import info.inetsolv.service.EmployeeService;
@Controller
@ComponentScan(basePackages={"info.inetsolv.DAO","info.inetsolv.service","info.inetsolv.controller","info.inetsolv.Entity","info.inetsolv.util"})
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}


	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public int insertRecords(Employee employee){
		 return employeeService.insertRecords(employee);
	}
}
