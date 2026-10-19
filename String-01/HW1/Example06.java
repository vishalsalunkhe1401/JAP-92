    // Write a Java  program to count occurrences of a character in a given string.

class Parent{
public static void countOccurrences(String str,char ch){
    int cnt=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==ch){
            cnt++;
    }
        }
        System.out.println(cnt);
}
}
public class  Example06 extends Parent{

public static void main (String[]args){

    String str="sfsftwjbf";
    char ch='f';
    countOccurrences(str,ch);

}

    
}