package org.example;

class Employee {
    private int id, age;
    private String name, deptName;
    private double salary;

    Employee() {
    }

    Employee(int id, String name, int age, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.deptName = deptName;
        this.salary = salary;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public Employee setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee getEmployee() {
        return new Employee(id, name, age, deptName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class BuilderDesignPattern {

    public static void main(String[] args) {
        Employee emp = new Employee().setId(1002).setName("Krish").getEmployee();
        System.out.println(emp);
    }
}
