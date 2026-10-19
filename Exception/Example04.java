import java.util.Scanner;
public class Example04{
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
		}catch(Exception e){
			//generic catch block
			e.printStackTrace();
		}
		System.out.println("Thank You !!!");
	}
}