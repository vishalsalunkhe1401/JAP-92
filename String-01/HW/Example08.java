 // Write a Java  program to find the total number of alphabets, digits or special characters in a string.

public class Example08{
	
	public static void main (String[]args){

		 String name ="VihShaL4544@7675jnjhbnfclnm";

		 char charnew[]=name.toCharArray();

		 String alpha="";
		 String digit="";
		 String sp="";

		  int alpha1=0;;
		 int digit2=0;;
		 int sp3=0;



        

        for(int i=0;i<charnew.length;i++){

            if(charnew[i]>='A'&&charnew[i]<='Z'||charnew[i]>='a'&&charnew[i]<='z'){
                 alpha1++;
                alpha+=name.charAt(i);
                


            }else if(charnew[i]>='0'&&charnew[i]<='9'){
            	digit2++;
               digit+=charnew[i];
               
            }
            else {
            	sp3++;
            	sp+=charnew[i];
            	
            }
        }

        System.out.println("Digit :"+digit+" Alpha: "+alpha+" SpecialChar: "+sp);
        System.out.println("Digit :"+digit2+" Alpha: "+alpha1+" SpecialChar: "+sp3);


	}
}