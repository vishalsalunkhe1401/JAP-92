class Operation{

	//data

	void doAdd(int x ,int y){
		System.out.println(x+y);
	}

	void doAdd(int x ,int y,int z){
		System.out.println(x+y+z);
	}

	void doAdd(int x ,double y){
		System.out.println(x+y);
	}

	void doAdd(double x ,int y){
		System.out.println(x+y);
	}
	// Method Overloading || Function Overloading

}

class A{
// error method f1() is already defined in class A
	//void f1(){}
	//void f1(){}
}

// if we want to use  compile time polymorphism we can do methood overloading 
public class App{
	
	public static void main(String[]args){

		Operation op=new Operation();

		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(11,22.22);
		op.doAdd(11.11,12);

		//int x;
		//code
		//int x; --variable x is already defined in method main (String[])


	}
}