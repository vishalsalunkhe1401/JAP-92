
package p2;

import java.util.Scanner;

import p1.Person;
import p1.Staff;
import p1.Student;

public class App{
	
	public static void main(String[]args){

		Student s1=new Student("Vishal","Sangola","FTC",2022,100000);

		System.out.println(s1.getProgram());
		System.out.println(s1.getYear());
		System.out.println(s1.getFee());

		System.out.println(s1.getName());
		System.out.println(s1.getAddress());

	System.out.println("-----------------------------------------------------");


		Student s2=new Student("sushnt","pune","puneCollege",2026,50000);

		System.out.println(s2.getProgram());
		System.out.println(s2.getYear());
		System.out.println(s2.getFee());

		System.out.println(s2.getName());
		System.out.println(s2.getAddress());

System.out.println("-----------------------------------------------------");

           Staff e1=new Staff("vishu","pune","vibrantmind",60000);

            System.out.println(e1.getSchool());
		    System.out.println(e1.getPay());

		System.out.println(e1.getName());
		System.out.println(e1.getAddress());

System.out.println("-----------------------------------------------------");

Staff e2=new Staff("susha","sangli","srvm",450000);

         System.out.println(e2.getSchool());
		 System.out.println(e2.getPay());

		System.out.println(e2.getName());
		System.out.println(e2.getAddress());

System.out.println("-----------------------------------------------------");

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = scanner.nextInt();

		  Student arr[] = new Student[size];
		  Staff arr1[] = new Staff[size];

		  System.out.println("-----------------------------------------------------");


		  for(int i=0; i<arr.length;i++){

		  	System.out.println("Enter Name:");
		  	String name = scanner.next();

		  	System.out.println("Enter Address:");
		  	String address = scanner.next();

		  	System.out.println("Enter Program:");
		  	String program = scanner.next();

		  	System.out.println("Enter Year:");
		  	int year = scanner.nextInt();

		  	System.out.println("Enter Fee:");
		  	double fee = scanner.nextDouble();
		  	 	


		  	arr[i]=new Student(name,address,program,year,fee);
		  }

		  System.out.println("-----------------------------------------------------");


           for(int i=0; i<arr.length;i++){

           System.out.println(arr[i].getName());
          
           System.out.println(arr[i].getAddress());

           System.out.println(arr[i].getProgram());

           System.out.println(arr[i].getYear());

           System.out.println(arr[i].getFee());
          System.out.println("-----------------------------------------------------");



		
}
 System.out.println("-----------------------------------------------------");


		  for(int i=0; i<arr1.length;i++){

		  	System.out.println("Enter Name:");
		  	String name = scanner.next();

		  	System.out.println("Enter Address:");
		  	String address = scanner.next();

		  	System.out.println("Enter school:");
		  	String school = scanner.next();

		  
		  	System.out.println("Enter Pay:");
		  	double pay = scanner.nextDouble();
		  	 	


		  	arr1[i]=new Staff(name,address,school,pay);
		  }

		  System.out.println("-----------------------------------------------------");


           for(int i=0; i<arr1.length;i++){

           System.out.println(arr1[i].getName());
          
           System.out.println(arr1[i].getAddress());

           System.out.println(arr1[i].getSchool());

           System.out.println(arr1[i].getPay());

           
          System.out.println("-----------------------------------------------------");



		
}

	}
}
