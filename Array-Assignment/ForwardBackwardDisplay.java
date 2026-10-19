// Array Case 1: Forward and Backward Display
//  Create an array of integers, store elements in it, and display the elements:
// - In forward order (from first to last)
// - In backward order (from last to first)
//  Example Input:
// Array = [10, 20, 30, 40, 50]
//  Expected Output:
// Forward: 10 20 30 40 50
// Backward: 50 40 30 20 10

  import java.util.Scanner;
  public class ForwardBackwardDisplay{

  public static void inforwardList(int B[]){
    System.out.println("Forward: ");

    for(int index=0; index<B.length; index++){

      System.out.println(B[index] + " ");
    }

    System.out.println();
}
public static void backwardList(int B[]){
  System.out.println("BackWard");

  for(int index=B.length - 1; index>=0; index--){
    System.out.println(B[index] + " ");
  }

}
 
  public static void main (String[]args){

    Scanner scanner=new  Scanner(System.in);

    System.out.println("Enter Size of  Array ");

    int size=scanner.nextInt();

    int A[] = new int[size];

    System.out.println("Enter Element");
     for(int index=0; index<A.length; index++){
      A[index]= scanner.nextInt();
     }

inforwardList(A);
backwardList(A);
  
  }
  }
