package pro.sky.skyproStreamAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproStreamAPI.Model.Employee;
import pro.sky.skyproStreamAPI.Service.DepartmentService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService employeeService;

    public DepartmentController(DepartmentService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam Integer departmentId) {
        return employeeService.getEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam Integer departmentId) {
        return employeeService.getEmployeeWithMinSalary(departmentId);
    }

    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> getAllEmployees(@RequestParam Integer departmentId) {
        return employeeService.getAllEmployees(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
//        1 - 3 Employee
//        2 - 2 Employee
        return employeeService.getAllEmployeesByDepartments();
    }
}
