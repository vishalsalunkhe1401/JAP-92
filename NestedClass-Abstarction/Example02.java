class Outer{

	private int outerField=11;
	//int outerField

	void outerFunction(){
		System.out.print("Outer Field "+outerField);
	}
	static class Inner{
		//private int innerField=22;

		int innerField=22;
		void innerFunction(){
			System.out.print("Inner Field "+innerField);
			//System.out.print("Outer Field "+outerField);
		}

	}

}

public class Example02{
	public static void main(String[] args) {

		//when we design static inner class
		//if we dont want to create outer class object but still need inner class object then

		Outer.Inner in=new Outer.Inner();
		in.innerFunction();
		
	}
}