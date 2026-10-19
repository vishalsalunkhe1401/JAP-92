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
	class Drowing extends Art{
		static{
		System.out.println("block1 Drowing");
	}
		{
		System.out.println("Drowing Instance Block");
	}


		Drowing(){

			super();
			System.out.println("drowing");
		}
		static{
		System.out.println("block2 drowing");
	}
	}

class Cartoon extends Drowing{
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





public class Example06{
	
	public static void main (String[]args){
                 // Art art;
			// Art.class load nahi hogi
		Cartoon c1=new Cartoon();


	}
}