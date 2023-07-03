package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		
		Employee emp = new Employee();
		emp.setFirstName("거");
		emp.setLastName("오");
		emp.setEmail("ohgeo@gmail.com");
		emp.setPhoneNumber("010-5555-5555");
		emp.setJobId("IT_PROG");
		emp.setSalary(5000);
		
		dao.insertEmployee(emp);
	}
}
