public class Example01{

	public static void f1(){
		System.out.println("This is Start f1()");
		f2();

		System.out.println("End f1()");
	}
	public static void f2(){
		System.out.println("This is Start f2()");
		f3();
		System.out.println("End f2()");

	}
	public static void f3(){
		System.out.println("This is Start f3()");
		
		System.out.println("End f3()");


	}

	public static void main(String[] args) {
	     System.out.println("Start IN");
	     f1();
	     System.out.println("Start End");
   	}
}
