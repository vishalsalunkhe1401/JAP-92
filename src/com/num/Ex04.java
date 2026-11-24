//    Write a Java program to print all even numbers between 1 to 100. - using while loop
package com.num;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int i=0;
		int n=100;
		int sum=0;
		
		while(i<=n) {
			
			sum=i+=2;
			System.out.println(sum);
			i++; 
		
			
		}
		
	}


}
