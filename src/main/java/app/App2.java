package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		
		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("opt", "id");
//		param.put("keyword", 100);
		
//		param.put("opt", "dept");
//		param.put("keyword", 60);
		
//		param.put("opt", "job");
//		param.put("keyword", "SH_CLERK");
		
		param.put("opt", "salary");
		param.put("min", 10000);
		param.put("max", 20000);
		
		List<Employee> employees = dao.searchEmployees(param);
		for (Employee e : employees) {
			System.out.println(e.getId() + "\t" +e.getFirstName() + "\t" + e.getJobId()
								+ "\t" + e.getSalary() + "\t" + e.getDepartmentId());
		} 
		
		
		
	}
}
