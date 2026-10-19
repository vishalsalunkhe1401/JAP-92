   // Write a Java  program to find the first occurrence of a character in a given string.

public class Example03{

    public int fristOcurrence(String str,char c){
         for(int i=0;i<str.length();i++){

            if(str.charAt(i)==c){
                return i; 

            }
                            


    }
    return -1;

   
}

    public static void main(String[]args){

        String str="Vbuddddhfa";
        char c='d';

        Example03 ex=new Example03();
      int res=ex.fristOcurrence(str,c);
      System.out.println(res);

        // for(int i=0;i<str.length();i++){

        //     if(str.charAt(i)==c){
        //         System.out.print(i);
              
        //         break;

        //     }
        
        // System.out.println();
        // System.out.println(p);
    }
    }
    
