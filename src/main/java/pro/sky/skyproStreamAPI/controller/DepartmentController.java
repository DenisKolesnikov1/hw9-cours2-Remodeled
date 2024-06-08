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

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam int departmentId) {
        return departmentService.getEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam int departmentId) {
        return departmentService.getEmployeeWithMinSalary(departmentId);
    }

    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> getAllEmployees(@RequestParam int departmentId) {
        return departmentService.getAllEmployees(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
        return departmentService.getAllEmployeesByDepartments();
    }
}
