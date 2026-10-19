 // Write a Java  program to check whether a string is palindrome or not.

 public class Example01{

 	public String checkPalindrome(String name){

 		String check="";

 		for(int i=name.length()-1;i>=0;i--){

 	 		 check+=name.charAt(i);

 	 	}
 	 	return check;


 	}

 	public void checkCondition(String check,String name){
 		if(name.equals(check)){
 	 		System.out.println("Palindrome  = "+check);
 	 	}else{
 	 		 System.out.println("NOt Palindrome = "+name);

 	 	}
 	}

 	 public static void main(String[] args) {

 	 	String name="mom";

 	 	Example01 ex=new Example01();


 	 	

 	 	String res=ex.checkPalindrome(name);
 	 	ex.checkCondition(res,name);

 	 	// for(int i=name.length()-1;i>=0;i--){

 	 	// 	check+=name.charAt(i);


 	 	// }
 	 	// if(name.equals(check)){
 	 	// 	System.out.println("Palindrome  = "+check);
 	 	// }else{
 	 	// 	 System.out.println("NOt Palindrome = "+name);

 	 	// }

 	 	


 		
 	}

 }
