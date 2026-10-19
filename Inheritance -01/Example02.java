
class A{
	int x=10;

	A(){
		System.out.println("This is Frist Constructor");

	}

	void displayX(){
     System.out.println(x);  

	}
}
	class B extends A{
	int y=20;
	B(){
		System.out.println("This is Seconds Constructor");

	}

	void displayY(){
		
     System.out.println(y);  

	}


}



public class Example02{

	public static void main(String[]args){

		B b1=new B();

		System.out.println(b1.x);
	    b1.displayX();

	    System.out.println(b1.y);
        b1.displayY();





	}
	


}