import java.util.Scanner;

class Student {
    // Attributes for the student's name and marks
    private String name;
    private double marks;

    // Constructor to initialize the student's name and marks
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to get the marks of the student
    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Input the student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            double marks = scanner.nextDouble();
            students[i] = new Student(name, marks);
        }

        // Calculate and display the average marks
        double averageMarks = calculateAverageMarks(students);
        System.out.printf("\nAverage Marks of Students: %.2f\n", averageMarks);

        // Display the details of each student
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }

    public static double calculateAverageMarks(Student[] students) {
        double totalMarks = 0.0;
        for (Student student : students) {
            totalMarks += student.getMarks(); 
        }
        return totalMarks / students.length;
    }
}
