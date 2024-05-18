package pro.sky.skyproStreamAPI.Service;

import pro.sky.skyproStreamAPI.Model.Employee;

import java.util.List;
import java.util.Map;


public interface EmployeeService {

    Map<Integer, List<Employee>> getAllByDepartments();

    Employee add(String firstName, Integer department, Integer salary);

    Employee delete(String firstName, int department, int salary);

    Employee find(String firstName, int department, int salary);

    List<Employee> findAll();

    Employee getEmployeeWithMaxSalary(Integer departmentId);

    Employee getEmployeeWithMinSalary(Integer departmentId);

    List<Employee> getAllEmployees(Integer departmentId);

    Map<Integer, List<Employee>> getAllEmployeesByDepartments();

}
