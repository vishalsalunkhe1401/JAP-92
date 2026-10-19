public class Example02{
	public static void main(String[]args){

		String s1="ABCD";
		String s2="ABCD";

		for(int i=0;i<s1.length()&&i<s2.length();i++){

			return s1.charAt(i)!=s2.charAt(i);
		}
         if(i<s2.length())
         	return -1;
         if(i<s1.length())
         	return-1;

         return 0;
	}
}