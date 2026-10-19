/*
// root Cosmic
public java.lang.Object{
	Object(){}
}
*/

class Art{

	{
		System.out.println("Art Instance Block");
	}

	 Art(){

	 super();
		System.out.println("Art");

	}


}
	class Drowing extends Art{
		{
		System.out.println("Drowing Instance Block");
	}


		Drowing(){

			super();
			System.out.println("drowing");
		}
	}

class Cartoon extends Drowing{
	{
		System.out.println("Cartoon Instance Block");
	}


	 Cartoon(){

              super();
			System.out.println("Cartoon");
	}

}





public class Example04{
	
	public static void main (String[]args){
    
        Cartoon c1=new Cartoon();

	}
}