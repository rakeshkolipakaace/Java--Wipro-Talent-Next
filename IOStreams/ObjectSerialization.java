package IOStreams;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        try {

            Employee employee = new Employee(
                    "Rakesh",
                    new Date(2000 - 1900, 6, 15),
                    "Engineering",
                    "Software Developer",
                    75000.00);

            FileOutputStream fileOut = new FileOutputStream("data");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Employee object serialized and saved to 'data' file.\n");

            FileInputStream fileIn = new FileInputStream("data");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee deserializedEmp = (Employee) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Employee object deserialized:");
            System.out.println("Name: " + deserializedEmp.getName());
            System.out.println("Date of Birth: " + deserializedEmp.getDateOfBirth());
            System.out.println("Department: " + deserializedEmp.getDepartment());
            System.out.println("Designation: " + deserializedEmp.getDesignation());
            System.out.println("Salary: " + deserializedEmp.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
