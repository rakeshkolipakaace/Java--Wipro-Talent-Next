package Collections;

import java.util.ArrayList;

public class employeedb {
    private ArrayList<employee> list = new ArrayList<>();

    public boolean addEmployee(employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (employee e : list) {
            if (e.getEmpId() == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (employee e : list) {
            if (e.getEmpId() == empId) {
                return "Pay slip for employee ID " + empId + " is: ₹" + e.getSalary();
            }
        }
        return "Employee not found!";
    }

    public void listAllEmployees() {
        for (employee e : list) {
            e.getEmployeeDetails();
            System.out.println("------------------------");
        }
    }
}
