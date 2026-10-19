
    // Write a Java  program to find the highest frequency character in a string.

    public class Example07{

    public static void main(String[]args){

       
       
        String str="AbsfhgyASHAVS";

        int res=0;
        int frq=0;

        for(int i=0;i<str.length();i++){
             int cnt=0;
             frq=0;
        
        
         for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                cnt++;
                frq++;
            }
        }
       if(res<cnt){
        res=i;
       }
   }
         System.out.println(str.charAt(res)+"");
         System.out.println(frq);
    }

    }
