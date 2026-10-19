import java.util.Scanner;
public class Array{

	public static void main(String[]args){
        int size;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size");
          
          size = sc.nextInt();

        int  A[]=new int[size];

        
        for(int i=0;i<A.length;i++){

        	 System.out.println("Enter num: ");

        	A[i]=sc.nextInt();
             
        }

    
          int B[]=new int[A.length+1];


         System.out.println("Add Element at End: ");

          int ele=sc.nextInt();

        // //   int i=0;
        //  for(int j=0;j<A.length;j++){
        //  	B[j]=A[i];
        //  	i++;

        
         for(int j=0;j<A.length;j++){
     B[j]=A[j];
}

 //Insert new element at end

    B[A.length] = ele;
  
        for(int e : B){      
          System.out.println(e);
          }
   

 	}
	
 }