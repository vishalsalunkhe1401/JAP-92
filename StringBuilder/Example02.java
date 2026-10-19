public class Example02{
	 
	 public static void main(String[] args) {

	 	StringBuilder sb1=new StringBuilder(); //it has capacity
	 	System.out.println(sb1);
	 	System.out.println(sb1.length());
	    System.out.println(sb1.capacity()); //16 default capacity

	    	 	System.out.println("-----------------------------------------------");


	    	 	StringBuilder sb2=new StringBuilder("India"); //it has capacity
	 	System.out.println(sb2);
	 	System.out.println(sb2.length());
	    System.out.println(sb2.capacity()); // default capacity

	    	    	 	System.out.println("-----------------------------------------------");=

	    	    	 	//String s1="AAA";    s1.concat("BBB"); String concat(String)

	    	    	 	//StringBuilder append() ---- oveloaded

	    	    	 	StringBuilder sb3=new StringBuilder(); //it has capacity
	    	    	 	sb3.append("China");
	 	System.out.println(sb3);
	 	System.out.println(sb3.length());
	    System.out.println(sb3.capacity()); // default capacity

	    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	    System.out.println("AAAAAAAAAAA");
	    System.out.println(sb3.length());
	    System.out.println(sb3.capacity()); // default capacity
	    	    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
     sb3.append("Z");
     System.out.println(sb3.length());
	    System.out.println(sb3.capacity()); // default capacity



	    	 	









	 	
	 }
}