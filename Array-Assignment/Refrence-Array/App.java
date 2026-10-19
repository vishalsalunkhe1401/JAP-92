import java.util.Scanner;
public class App{

	public static void main(String[]args){

		Student studentList[]=new Student[5];

		Scanner scanner=new Scanner(System.in);

		for(int i=0; i<studentList.length;i++){

			System.out.println("Enter Name");
			String name = scanner.nextLine();

			System.out.println("Enter Marks");

			double marks = scanner.nextDouble();
            scanner.nextLine();

            studentList[i]=new Student(name,marks);
		}
		 System.out.printf("%-5s %-10s %-10s%n", "ID","Name","Marks");

           System.out.println("---------------------------------------");
           for(int i=0; i<studentList.length;i++){
           	studentList[i].studentInfo();
           }
             System.out.println("---------------------------------------");

             for(Student student:studentList){
             	student.studentInfo();
             }

	}
}
