public class Example02{

	public static void f1(){
		System.out.println("Start f1()");
		f2();
		System.out.println("End f1()");
	}
	public static void f2(){
		System.out.println("Start f2()");
		f3();
		System.out.println("End f2()");
	}
		public static void f3(){

			 System.out.println("Start f3()");
            try{
			 int res=11/0;
			 System.out.println(res);
            }catch(ArithmeticException e){
            	System.out.println("--------"+e);
            	System.out.println("End f3()");
            }


		}
	
	public static void main(String[] args) {
		System.out.println("Start Point");
		f1();
		System.out.println("End Main");
	}
}