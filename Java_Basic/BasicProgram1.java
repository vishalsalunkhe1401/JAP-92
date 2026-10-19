//	        Write a program to enter two numbers and find their sum.
		      //  Write a  program to enter two numbers and perform all arithmetic operations.


import java.util.*;
class BasicProgram1{

	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);

		int a =14;
		int b =25;
         int sum = a+b;
         System.out.println(sum);

		System.out.println("Enter Frist Number");

		int num1=sc.nextInt();

		System.out.println("Enter Second Number");

		int num2=sc.nextInt();

		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

		sc.close();

	}
}