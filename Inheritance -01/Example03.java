/*
// root Cosmic
public java.lang.Object{
	Object(){}
}
*/
class Art{

	 Art(){

	 super();
		System.out.println("Art");

	}


}
	class Drowing extends Art{

		Drowing(){

			super();
			System.out.println("drowing");
		}
	}

class Cartoon extends Drowing{

	 Cartoon(){

              super();
			System.out.println("Cartoon");
	}

}





public class Example03{
	
	public static void main (String[]args){
    
        Cartoon c1=new Cartoon();

	}
}