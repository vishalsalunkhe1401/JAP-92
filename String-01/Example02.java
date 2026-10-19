// class String {
// 	public String concat(String);
// }

public class Example02{
	
	public static void main(String[]args){

		String s1=new String("Dreamer"); //immutable 

		s1=s1.concat(" relentless");

		System.out.println(s1);
	}
}