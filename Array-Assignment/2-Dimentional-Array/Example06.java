import java.util.Scanner;

class InputData{
public void inputData(int arr1[][]){
	Scanner scanner=new Scanner(System.in);
for(int i=0;i<arr1.length;i++){
	for(int j=0;j<arr1[i].length;j++){
		System.out.println("Enter Elements");
		arr1[i][j]=scanner.nextInt();
	}
	System.out.println();
}
}

}
class OutputData{

public void  outputData(int arr1[][]){
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr1[i].length;j++){
			System.out.print(arr1[i][j]+" ");

		}
		System.out.println();
	}
}

}
public class Example06{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

       System.out.println("Enter Row");
       int row=scanner.nextInt();

       System.out.println("Enter Col");
       int col=scanner.nextInt();

       int arr[][]=new int[row][col];

      InputData inp=new InputData();
      inp.inputData(arr);

      OutputData oup=new OutputData();

      oup.outputData(arr);


	}
}