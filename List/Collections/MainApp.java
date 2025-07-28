package List.Collections;

public class MainApp {
    public static void main(String[] args) {
        employeedb db = new employeedb();

        employee e1 = new employee(101, "Rakesh", "rakesh@mail.com", "Male", 50000f);
        employee e2 = new employee(102, "Sneha", "sneha@mail.com", "Female", 60000f);
        employee e3 = new employee(103, "Arjun", "arjun@mail.com", "Male", 55000f);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("All Employees:");
        db.listAllEmployees();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(101);

        System.out.println("\nAfter Deletion:");
        db.listAllEmployees();
    }
}
