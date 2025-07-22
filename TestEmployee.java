class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // Call Person constructor
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Roy", 10000.0, 2020, "123456789");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
