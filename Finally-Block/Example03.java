public class Example03{
	public static void main(String[] args) {
		try{
			System.exit(1);// finally block will not execute in case of System.exit(status_code)
			System.out .println(11/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught");
		}
		finally{
			System.out.println("finally block execute");
		}
		System.out.println("Thanku... !!!");
	}
}