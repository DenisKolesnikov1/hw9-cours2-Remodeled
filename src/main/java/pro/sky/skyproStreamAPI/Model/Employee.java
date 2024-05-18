package pro.sky.skyproStreamAPI.Model;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private Integer department;
    private Integer salary;

    private static int counter;

    public Employee(String name, Integer department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++ counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }




    public void setDepartment(Integer department) {
        this.department = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return id + " - " + name + " из " + department + " отдела. зп составила " + salary + "рублей.";
    }
}
