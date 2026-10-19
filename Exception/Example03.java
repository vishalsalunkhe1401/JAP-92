import java.util.Scanner;

public class Example03{
	
	public static void main(String[] args) {

		int x,y;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter x");
		x=scanner.nextInt();
		System.out.println("Enter y");
		y=scanner.nextInt();

		int arr[]={11,22,33,44,55};

		String str=null;

		try{
			int res=x/y;

			System.out.println(arr[res]);
			System.out.println(str.length());	
	} catch(ArithmeticException e) {
		e.printStackTrace();

	}catch(ArrayIndexOutOfBoundsException a) {

		a.printStackTrace();
	}catch(NullPointerException s){
		s.printStackTrace();
	}   

	System.out.println("Thank You !!!");       

   }
}