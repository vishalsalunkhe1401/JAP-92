
    // Write a Java  program to search all occurrences of a character in a given string.

    public class Example05{

        public static void allOccurrences(String name,char ch){
               // int cnt=0;
            for(int i=0;i<name.length();i++){

                if(name.charAt(i)==ch){
                    // cnt=i;
                  System.out.println(i);//cnt

                }
            }
        }

        public static void main (String[]args){

            String name="avsavbuasghba";
            char ch='a';

            allOccurrences(name,ch);
        }

    }
