package pro.sky.skyproStreamAPI.Service;

import pro.sky.skyproStreamAPI.Model.Employee;
import pro.sky.skyproStreamAPI.exception.EmployeeNotFoundException;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public interface DepartmentService {


    Employee getEmployeeWithMaxSalary(Integer departmentId);

    Employee getEmployeeWithMinSalary(Integer departmentId);

    List<Employee> getAllEmployees(Integer departmentId);

    Map<Integer, List<Employee>> getAllEmployeesByDepartments();

}
