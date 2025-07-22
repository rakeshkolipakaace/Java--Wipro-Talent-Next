// PersonInheritance.java
class PersonInheritance {
    String name;
    String dateOfBirth;

    PersonInheritance(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


// Teacher.java
class Teacher extends PersonInheritance {
    int salary;
    String subject;

    Teacher(String name, String dateOfBirth, int salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }
}


// Student.java
class Student extends PersonInheritance {
    int studentId;

    Student(String name, String dateOfBirth, int studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

// CollegeStudent.java
class CollegeStudent extends Student {
    String college;
    int year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String college, int year) {
        super(name, dateOfBirth, studentId);
        this.college = college;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public int getYear() {
        return year;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Main.java
 class Main {
    public static void main(String[] args) {
        PersonInheritance p = new PersonInheritance("Roy", "2000-01-01");
        System.out.println("Person: " + p.getName() + ", DOB: " + p.getDateOfBirth());

        Teacher t = new Teacher("Alice", "1985-05-15", 60000, "Math");
        System.out.println("Teacher: " + t.getName() + ", Subject: " + t.getSubject() + ", Salary: " + t.getSalary());

        Student s = new Student("Bob", "2002-08-10", 101);
        System.out.println("Student: " + s.getName() + ", ID: " + s.getStudentId());

        CollegeStudent c = new CollegeStudent("Charlie", "2003-03-20", 202, "IIT", 2);
        System.out.println("College Student: " + c.getName() + ", College: " + c.getCollege() + ", Year: " + c.getYear());
    }
}
