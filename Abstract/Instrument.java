abstract class Instrument{
	
	abstract void play();

	void adjust(){

		System.out.println("adjust::Instrument");
	}
}
 class Guitar extends Instrument{
 	@Override
 	void play(){
 		System.out.println("Guitar play...");
 	}

 	@Override
 	void adjust(){
 		System.out.println("adjust::Guitar");
 	}
 }
 class Flute extends Instrument{

 	@Override

 	void play(){

 		System.out.println("Flute play...");
 	}
 } 
 class Violin extends Instrument{
 	@Override
 	void play(){
 		System.out.println("Violin play...");
 	}
 }
 class App{

 	public static void main(String[] args){

 		Instrument i1=new Guitar();
 		i1.play();
 	}
 }
