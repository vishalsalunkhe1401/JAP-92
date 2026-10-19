// Develop a Student Record Management System using an array of Student object references.

// Maximum capacity: 10 students.

// class Student {
//     int studentId;
//     String studentName;
//     double marks[5];
// }

// Functional Requirements
// Add a new student.
// Search for a student using a student ID.
// Update marks of a student.
// Delete a student record.
// Display all students.
// Find the student with the highest marks.
// Calculate average marks of all students.
import java.util.Scanner;
public class App{
    public static void main (String[]args){

        Student s1[]=new Student[10];

        Scanner scanner=new Scanner(System.in);

         System.out.println("Enter Name");

         String name=scanner.nextLine();

          System.out.println("Enter Marks");
          double marks=scanner.nextDouble();

          addStudent(name,marks);








    }
    
}