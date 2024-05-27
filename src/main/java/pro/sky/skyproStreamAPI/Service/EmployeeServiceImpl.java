package pro.sky.skyproStreamAPI.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyproStreamAPI.Model.Employee;
import pro.sky.skyproStreamAPI.exception.EmployeeNotFoundException;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final List<Employee> employees = List.of(
            new Employee("Николай", 1, 2000),
            new Employee("Петр", 1, 4000),
            new Employee("Сергей", 1, 800),
            new Employee("Иван", 2, 3000),
            new Employee("Федор", 2, 100000)
    );


    @Override
    public Employee add(String firstName, int department, int salary) {
        Employee employee = new Employee(firstName, department, salary);
        employees.add(employee);
        return employee;
    }


    @Override
    public Employee find(String firstName) {
        Employee newemployee = new Employee(firstName);
        for (Employee employee : employees) {
//            if (employee.equals(newemployee)) ;
            return employee;
        }
        throw new EmployeeNotFoundException("сотрудника не смогли найти" + firstName);
    }


    @Override
    public Employee delete(String firstName) {
        Employee newemployee = new Employee(firstName);
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.equals(newemployee)) {
                employees.remove(i);
                //               return true;
            }
        }
        return newemployee;
    }
//    void test() {
//        Employee employee = find("", 4, 4);
//        System.out.println(employee.getSalary());
//    }


    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
