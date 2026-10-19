//     * 4
//    ** 3
//   *** 2
//  **** 1
// ***** 0 

public class  Ex09{
	public static void main(String []args){

		int n=5;
		for(int i=1; i<=n;i++){
			for(int sp=i;sp<n;sp++){
				
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
             System.out.println();
		}

	}
} 



