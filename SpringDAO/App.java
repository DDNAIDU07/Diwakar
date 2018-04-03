package info.inetsolv.SpringDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import info.inetsolv.DAO.EmployeeDAO;
import info.inetsolv.Entity.Employee;
import info.inetsolv.controller.EmployeeController;

public class App 
{
public static void main( String[] args ){
	
	
	ApplicationContext container=new AnnotationConfigApplicationContext(EmployeeDAO.class);
        Employee employee=new Employee();
        employee.setEno(2);
        employee.setName("Diwa");
        employee.setSalary(2000d);
        EmployeeController controller = container.getBean(EmployeeController.class);
        controller.insertRecords(employee);
	((AbstractApplicationContext)container).close();
}
}
