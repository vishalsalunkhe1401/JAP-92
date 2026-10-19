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
// Calculate average

public class Student{

	int studentId;
	String studentName;
	double  marks[] = new double[5];

	public void addStudent(String name,double marks){
		this.studentName=name;
		this.marks=marks;
		System.out.println("Name : " + name + " " + "Marks : " +marks);

	}

	// public void searchStudentID(){

	// }
	// public void updateMarks(){

	// }
	// public void deleteStudentRecord(){

	// }
	// public void display allStudent(){

	// }
	// public void findStudentHighestMarks(){

	// }
	// public void calculateAverage(){

	// }


	}

	
