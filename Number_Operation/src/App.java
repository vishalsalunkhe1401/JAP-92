import java.util.Scanner;
public class App{

	public static void main(String[]args){

		NumberOperation obj1 = new  NumberOperation();
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The Number");
     int num=sc.nextInt();

     obj1.number=num;
     System.out.println(obj1.sumOfDigit());
     obj1.factor();
}