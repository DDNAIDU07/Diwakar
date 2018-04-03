package info.inetsolv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.inetsolv.DAO.EmployeeDAO;
import info.inetsolv.Entity.Employee;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}


	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}


	public int insertRecords(Employee employee){
	return	employeeDAO.insertRecords(employee);
	}
}
