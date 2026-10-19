  // Write a Java  program to reverse order of words in a given string.  
public class Example02{

    public static void reverseWord(String order){
        String arr[]=order.split(" ");

        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+"   ");
        }



    }

    public static void main(String[]args){

        String order="Dreamer Vishal";
        reverseWord(order);

        // String arr[]=order.split(" ");

      // for(int i=0;i<arr.length;i++){
      //   System.out.println(arr[i]);
      // }

        // for(int i=arr.length-1;i>=0;i--){

        //     System.out.print(arr[i]+"   ");
        // }

    }
    
}