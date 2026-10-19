
    // Write a Java  program to find the last occurrence of a character in a given string.


public class Example04{

public int lastOccurrrence(String str,char c){
	int cnt=0;
	int other=0;

	for(int i=0;i<str.length();i++){

		if(str.charAt(i)==c){
			cnt=i;
	
		}
}
           return cnt;
      
}

	public static void main(String[]args){

		String str="visvdkvfhv";
			char c='v';

			
			
      Example04 er=new Example04();

		int ans=er.lastOccurrrence(str,c);
		System.out.println(ans);




	}
}