//	        Write a  program to enter the length and breadth of a rectangle and find its perimeter.


import java.util.Scanner;
class RectanglePerimeter2{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Length :" );
         int length = sc.nextInt();

		System.out.print("Enter Breadth :" );
         int breadth = sc.nextInt();


         int perimeter = 2 * (length+breadth);

         System.out.print(perimeter);

         sc.close();


		

	}

}