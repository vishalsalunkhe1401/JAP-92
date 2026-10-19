import java.util.Scanner;
public class Example01{

	public static void main(String[]args){
		int row; int col;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Row");
		row=scanner.nextInt();

		System.out.println("Enter Col");
		col=scanner.nextInt();

		int arr[][]=new int [row][col];
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){

				System.out.println("Enter Elements");
				arr[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){

				System.out.println(arr[i][j] + " ");

	}
	        System.out.println();
	
} 
   }
}