/*
// root Cosmic
public java.lang.Object{
	Object(){}
}
*/

class Art{

	static{
		System.out.println("block1 Art");
	}

	{
		System.out.println("Art Instance Block");
	}

	 Art(){

	 super();
		System.out.println("Art");

	}
	static{
		System.out.println("block2 Art");
	}


}
	class Drawing extends Art{
		static{
		System.out.println("block1 Drowing");
	}
		{
		System.out.println("Drawing Instance Block");
	}


		Drawing(){

			super();
			System.out.println("drowing");
		}
		static{
		System.out.println("block2 drowing");
	}
	}

class Cartoon extends Drawing{
	static{
		System.out.println("block1 Cartoon");
	}
	{
		System.out.println("Cartoon Instance Block");
	}


	 Cartoon(){

              super();
			System.out.println("Cartoon");
	}
	static{
		System.out.println("block2 Cartoon");
	}

}





public class Example05{
	
	public static void main (String[]args){
    
       			Drawing d1=new Drawing();


	}
}