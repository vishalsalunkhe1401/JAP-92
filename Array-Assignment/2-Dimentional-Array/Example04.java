import java.util.Scanner;
public class Example04{

	public static void main(String[]args){

		char name[]={'v','i','s','h','a','l'};


		for(char letter : name)
			System.out.println(letter);

		System.out.println();
		
		


		char A[][]={{'D','R','E','A','M','E','R'},{'V','I','S','H','A','L'},{'V','I','B','R','N','T'}};

		for(char symbols []:A){
			for(char alpha:symbols){
							System.out.println(alpha);


			}

			System.out.println();			

		}

		System.out.println("-----------------------------------------------------------");

		char arr[]=new char[7];
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<arr.length;i++){

			System.out.println("Enter A Letter");
			arr[i]=scanner.next().charAt(0);
		} 
		for(char ele :arr)
			System.out.println(ele);
	}
	
}