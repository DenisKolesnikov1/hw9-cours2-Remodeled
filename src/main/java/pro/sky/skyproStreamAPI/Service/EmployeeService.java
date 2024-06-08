package pro.sky.skyproStreamAPI.Service;

import pro.sky.skyproStreamAPI.Model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService  {

    Employee add(String firstName, String lastName, int department, int salary);

    Employee find(String firstName, String lastName);

    Employee delete(String firstName, String lastName);

    Collection<Employee> findAll();
}

