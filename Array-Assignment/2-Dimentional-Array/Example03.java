import java.util.Scanner;
public class Example03{

	public static void inputData(int arr[][]){
		System.out.println("------------------------Input Array---------------------");

	Scanner scanner=new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){

				System.out.println("Enter Elements");
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println();
	}

	public static void  displayData(int arr[][]){
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){

				System.out.printf("%d",arr[i][j]);
	}
	        System.out.println();	
}
System.out.println("-----------------------------------------------");	
	}

	public static void  doAdd(int A[][],int B[][],int C[][]){
		for(int i=0; i<A.length;i++){
			for(int j=0; j<A[i].length;j++){
				C[i][j]=A[i][j]+B[i][j];

	}
}
}

	public static void main(String[]args){
		int row; int col;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Row");
		row=scanner.nextInt();

		System.out.println("Enter Col");
		col=scanner.nextInt();

		
		int A[][]=new int [row][col];
		int B[][]=new int [row][col];
		int C[][]=new int [row][col];

inputData(A);
inputData(B);

doAdd(A,B,C);

displayData(A);
displayData(B);
displayData(C);


		
   }
}

