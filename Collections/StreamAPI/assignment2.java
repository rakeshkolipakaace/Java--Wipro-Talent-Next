package Collections.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void display() {
        System.out.println("EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}

public class assignment2 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rakesh", 25, "Pune"));
        employees.add(new Employee(102, "Amit", 30, "Mumbai"));
        employees.add(new Employee(103, "Sneha", 28, "Pune"));
        employees.add(new Employee(104, "Raj", 35, "Delhi"));
        employees.add(new Employee(105, "Neha", 24, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees located in Pune:");
        for (Employee emp : puneEmployees) {
            emp.display();
        }
    }
}
