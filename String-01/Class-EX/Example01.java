public class Example01{
	public static void main(String[]args){

		String s1="Hello";
		String s2="Hello";
		//public int compareTo(String);

		int res=s1.compareTo(s2);

		System.out.println(res);

       String s3="Apple";
       String s4="Bannana";

       int res1=s3.compareTo(s4);
       System.out.println(res1);

       String s5="AAB";
       String s6="AABC";

       int res2=s5.compareTo(s6);
       System.out.println(res2);

       String s7="A";
       String s8="a";
       int res3=s7.compareTo(s8);
       System.out.println(res3);

       String s9="";
       String s10="D";
       int res4=s9.compareTo(s10);
       System.out.println(res4);


         // public interface java.lang.comparable<T>{

         // 	public int compare(object 0);
         // 	public int compareT(T o);

         // }
         // public class final java.lang.String
         // implements comparable<String>{
         // 	@Override
         // 	public int compareTo(Sting 0){
         // 		return 0;
         // 		return -1;
         // 		return 1;


         // 	}
         // }

	}
}