import java.util.Scanner;

public class Example06{

	public static void inputData(int B[]){
		 Scanner scanner = new Scanner(System.in);

		for(int index=0;index<B.length;index++){
			System.out.println("Enter Array!!!");
			B[index]=scanner.nextInt();
		}
	}

		public static void outputData(int B[]){
			for(int i=0;i<B.length;i++){
				System.out.print(B[i]+" ");
			}
			
		}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		     int size=scanner.nextInt();
		   int A[]=new int [size];

		   inputData(A);
		   System.out.println("Display Data");
		   outputData(A);
	}
}