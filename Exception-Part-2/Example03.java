// import java.io.ArithmeticException;
public class Example03{

	public static void f1(){
		f2();
	}
	public static void f2(){
		f3();
	}
	public static void f3() throws ArithmeticException{

		System.out.println(11/0);

	}

	public static void main(String[] args) {
		try{
		 f1();
		}catch(ArithmeticException e){
						e.printStackTrace();

			System.out.println("Exception Handled!");
		System.out.println("Thanku...!!!");
}
	}
}