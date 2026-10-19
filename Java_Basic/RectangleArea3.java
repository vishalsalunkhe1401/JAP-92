//Write a  program to enter the length and breadth of a rectangle and find its area.

import java.util.Scanner;
class RectangleArea3{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Length :" );
         int length = sc.nextInt();

		System.out.print("Enter Breadth :" );
         int breadth = sc.nextInt();


         int area = length*breadth;

         System.out.print(area);

         sc.close();


		

	}

}