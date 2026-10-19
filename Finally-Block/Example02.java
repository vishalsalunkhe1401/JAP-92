public class Example02{
	public static void main(String[] args) {
		try{
			System.out.println(11/0);
		}
		catch(ArithmeticException e){
			
		System.out.println("Exception Caught");

		}
		finally{
			System.out.println("finally block execute");
		}
		System.out.println("Thanku...!!!");
	}
}