package info.inetsolv.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import info.inetsolv.Entity.Employee;
@Repository
@ComponentScan(basePackages={"info.inetsolv.DAO","info.inetsolv.service","info.inetsolv.controller","info.inetsolv.Entity","info.inetsolv.util"})
public class EmployeeDAO {
    @Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int insertRecords(Employee employee){
		String query="insert into emp values(?,?,?)";
		return jdbcTemplate.update(query, employee.getEno(),employee.getName(),employee.getSalary());
		
	}
}
