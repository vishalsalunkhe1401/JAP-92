 // Write a Java  program to count the total number of vowels and consonants in a string.

public class Example09{

	public static void main(String[] args) {

		int vowelCnt=0;
		int consonantsCnt=0;

		String name="ViUEsh454";

	for(int i=0;i<name.length();i++){

		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'){
            vowelCnt++;

		}else{
			consonantsCnt++;
		}
		
	}

	System.out.println("vowel :"+vowelCnt+" consonants: "+consonantsCnt);
	}
	
}