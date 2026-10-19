  // Write a Java  program to toggle the case of each character of a string.  

public class Example07{
    public static void main(String[]args){

        String name ="VIshal dReAmeR";

        char arr[]=name.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>='A'&&arr[i]<='Z'){

                arr[i]=(char)(arr[i]+32);


            }else if(arr[i]>='a'&&arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }

        for(char n:arr){
            System.out.print(n);
        }

    }
    
}