package dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	@SuppressWarnings("deprecation")
	private SqlMapClientTemplate template;
	
	public void insertEmployee(Employee employee) {
		template.insert("insertEmployee", employee);
	}
	
	public int getAllEmployeesCount() {
		return (Integer) template.queryForObject("getAllEmployeesCount");
	}
	
	public int getEmployeesCountByDeptId(int deptId) {
		return (Integer) template.queryForObject("getEmployeesCountByDeptId", deptId);
	} 
	
	public double getAnnualSalaryByEmpId(int empId) {
		return (Double) template.queryForObject("getAnnualSalaryByEmpId", empId);
	}
	
	public List<String> getAllDeptNames() {
		return (List<String>) template.queryForList("getAllDeptNames");
	}
	
	public Employee getEmployeeById(int empId) {
		return (Employee) template.queryForObject("getEmployeeById", empId);
	}
	
	public List<Employee> searchEmployees(Map<String, Object> param) {
		return (List<Employee>) template.queryForList("searchEmployees", param);
	}
}








