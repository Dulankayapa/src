
package q1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentID;
    private String name;
    private String address;
    private int contactNumber;

    // constructor
    public Student() {

    }

    // method to read student details
    public void Read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        studentID = scanner.next();
        System.out.println("Enter Student name :");
        name = scanner.next();
        System.out.println("Enter Address :");
        address = scanner.next();
        System.out.println("Enter contactNumber :");
        contactNumber = scanner.nextInt();
        scanner.close();

    }

    // method to print student details
    public void Print() {

        System.out.println("Student Information: ");
        System.out.println("Student ID is: " + studentID);
        System.out.println("Student Name is: " + name);
        System.out.println("Student Address is: " + address);
        System.out.println("Student Telephone is: " + contactNumber);

    }

    public String GetName() {
        // TODO Auto-generated method stub
        return name;
    }

}

class Course {
    private String courseId;
    private String cname;
    private String instructor;
    private List<Student> enrolledStudents;

    // Constructor
    public Course() {
        enrolledStudents = new ArrayList<>();
    }

    // Method to read course details
    public void read(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course ID: ");
        courseId = scanner.next();
        System.out.println("Enter Course Name: ");
        cname = scanner.next();
        System.out.println("Enter Instructor Name: ");
        instructor = scanner.next();
        student.Read(); // Reading student details
        addStudent(student); // Adding student to the course
        scanner.close();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to print course details and enrolled students
    public void Print() {
        System.out.println("Course Information: ");
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + cname);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled Students: ");
        for (Student student : enrolledStudents) {
            System.out.println(student.GetName()); // Assuming a getName() method in Student class
        }
    }

}
 class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        // Creating and adding students and courses
        for (int i = 0; i < 2; i++) {
            Student student = new Student();
            Course course = new Course();
            student.Read();
            course.read(student);
            students.add(student);
            courses.add(course);
        }

        // Displaying all students and courses
        for (Student student : students) {
            student.Print();
        }
        for (Course course : courses) {
            course.Print();
            }
        }
}