//     5
//    45
//   345
//  2345
// 12345

public class Ex14{

    
	public static void main(String[]args){

		int n=5;
		for(int i=5;i>=1;i--){
			for(int sp=i;sp>1;sp--){
				System.out.print(" ");

			}
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}
}    