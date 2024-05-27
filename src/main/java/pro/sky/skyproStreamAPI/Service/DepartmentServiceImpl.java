package pro.sky.skyproStreamAPI.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyproStreamAPI.Model.Employee;
import pro.sky.skyproStreamAPI.exception.EmployeeNotFoundException;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee getEmployeeWithMaxSalary(Integer departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("сотрудника не смогли найти"));
    }

    @Override
    public Employee getEmployeeWithMinSalary(Integer departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("сотрудника не смогли найти"));
    }

    @Override
    public List<Employee> getAllEmployees(Integer departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartment()== null || employee.getDepartment().equals(departmentId))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
        return employeeService.findAll().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

}
