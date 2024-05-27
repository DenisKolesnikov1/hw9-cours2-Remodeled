package pro.sky.skyproStreamAPI.Service;

import pro.sky.skyproStreamAPI.Model.Employee;

import java.util.List;

public interface EmployeeService  {

    Employee add(String firstName, int department, int salary);

    Employee find(String firstName);

    Employee delete(String firstName);

    List<Employee> findAll();
}

