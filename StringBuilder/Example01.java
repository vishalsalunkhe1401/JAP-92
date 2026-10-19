public class Example01{
	 public static void main(String[] args) {

	 	StringBuilder sb1=new StringBuilder();
	    StringBuilder sb2=new StringBuilder(55);
	    StringBuilder sb3=new StringBuilder("Hello");
	    CharSequence letters=new String("Hello");
	 	StringBuilder sb4=new StringBuilder(letters);

	 	System.out.println(sb1);
	    System.out.println(sb1.length());// it has capacity
	 	System.out.println(sb1.capacity());//16 default capacity
	    System.out.println(sb2);
	 	System.out.println(sb3);
	 	System.out.println(sb4);




		
	}
}