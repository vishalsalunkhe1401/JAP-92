public class Example02{
	
	 public static void main(String[] args) {

	 	String str2="good";
	 	//Constant +Constant ---goodtime
	 	String str2="good"+"time";
	 	String str3="goodtime";

	 	if(str2==str3)
	 		System.out.println("Equal");
	 	else
	 	    System.out.println(" Not Equal");

		if(str2.equals(str3))
	 		System.out.println("Equal");
	 	else
	 	    System.out.println(" Not Equal");
	}
}