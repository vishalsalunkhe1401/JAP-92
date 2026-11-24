import java.util.Scanner;

public class Example05{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size");

        int size=sc.nextInt();

        int A[] = new int[size];

        for(int i=0;i<A.length;i++){

        	System.out.println("Enter no");

        	A[i]=sc.nextInt();

        }

        System.out.println("Display Array!!");

        for(int i=0;i<A.length;i++){
        	System.out.print(A[i]+" ");
        }
	}
}