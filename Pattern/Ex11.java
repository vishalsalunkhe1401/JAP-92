//     5
//    44
//   333
//  2222
// 11111

public class Ex11{
	
	public static void main(String[]args){
	   int n=5;
	   for(int i=n;i>=1;i--){
	   	for(int sp=i;sp>1; sp--){
	   		System.out.print(" ");
	   	}
	   //	for(int j=n;j>=i;j--){
	   	for(int j=i;j<=n;j++){
	   		System.out.print(i);
	   	}

	   	
	   	System.out.println();

	   }
	}
	
} 