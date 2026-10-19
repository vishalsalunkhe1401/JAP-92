import java.util.Scanner;

public class SumOfNo{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter No");

		int num=scanner.nextInt();
            int sum=0;
		for(int i=1;i<=num;i++){
			 sum+=i;
		}
		System.out.println("Sum Of No "+sum);
	}
}
