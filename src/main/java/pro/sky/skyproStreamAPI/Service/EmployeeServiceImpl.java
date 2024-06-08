package pro.sky.skyproStreamAPI.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyproStreamAPI.Model.Employee;
import pro.sky.skyproStreamAPI.exception.EmployeeNotFoundException;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final Map<String, Employee> employees = new HashMap<>();
    private String buildKey(String firstName, String lastName) {
        return firstName + " " + lastName;
    }


    @Override
    public Employee add(String firstName, String lastName, int department, int salary) {
        String key = buildKey(firstName, lastName);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException(key);
        }
        Employee employee = new Employee(firstName, lastName, department, salary);
        employees.put(key, employee);
        return employee;
    }


    @Override
    public Employee find(String firstName, String lastName) {
        String key = buildKey(firstName, lastName);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException(key);
        }
        return employees.get(key);
    }



    @Override
    public Employee delete(String firstName, String lastName) {
        String key = buildKey(firstName, lastName);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException(key);
        }
        return employees.remove(key);
    }


    @Override
    public Collection<Employee> findAll() {
        return employees.values();
    }
}
