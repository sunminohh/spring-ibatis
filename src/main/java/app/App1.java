package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		
		Employee emp = dao.getEmployeeById(100);
		System.out.println(emp.getId());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhoneNumber());
		System.out.println(emp.getHireDate());
		System.out.println(emp.getJobId());
		System.out.println(emp.getSalary());
		System.out.println(emp.getCommissionPct());
		System.out.println(emp.getManagerId());
		System.out.println(emp.getDepartmentId());
	}
}
