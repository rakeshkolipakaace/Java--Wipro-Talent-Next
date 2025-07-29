package Collections.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + mark);
    }
}

public class assignment3 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rakesh", 65));
        students.add(new Student(2, "Amit", 45));
        students.add(new Student(3, "Sneha", 75));
        students.add(new Student(4, "Raj", 38));
        students.add(new Student(5, "Neha", 55));

        List<Student> passedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Number of students who cleared the test: " + passedStudents.size());

        System.out.println("\nPassed Students:");
        passedStudents.forEach(Student::display);
    }
}
