// Base class: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: Student
class Student extends Person {
    private String studentID;
    private String major;

    // Constructor
    public Student(String name, int age, String studentID, String major) {
        super(name, age); // Call to Person constructor
        this.studentID = studentID;
        this.major = major;
    }

    // Overriding displayInfo method to include student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to Person's displayInfo
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }
}

// Derived class: Teacher
class Teacher extends Person {
    private String teacherID;
    private String subject;

    // Constructor
    public Teacher(String name, int age, String teacherID, String subject) {
        super(name, age); // Call to Person constructor
        this.teacherID = teacherID;
        this.subject = subject;
    }

    // Overriding displayInfo method to include teacher details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to Person's displayInfo
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Subject: " + subject);
    }
}

// Main class to simulate object-oriented modeling
public class w6q4 {
    public static void main(String[] args) {
        // Creating a student and a teacher
        Student student = new Student("Ahmad", 20, "S12345", "Computer Science");
        Teacher teacher = new Teacher("Mr. Anuj", 45, "T98765", "Mathematics");

        // Displaying information using polymorphism
        System.out.println("Student Information:");
        student.displayInfo(); // Calls Student's displayInfo

        System.out.println("\nTeacher Information:");
        teacher.displayInfo(); // Calls Teacher's displayInfo
    }
}
