  // Write a Java  program to convert uppercase string to lowercase

public class Example06{
    public static void main(String[]args){

        String name ="VISHAL DREAMER";

        char arr[]=name.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>='A'&&arr[i]<='Z'){

                arr[i]=(char)(arr[i]+32);
            }
        }

        for(char n:arr){
            System.out.print(n+"");  
        }
    }

    
}