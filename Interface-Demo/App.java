interface CanFight{

      void fight();
}
interface CanFly{

	void fly();
}
interface CanSwim{

	void swim();
}

class ActionCharacter{

	public void fight(){

		System.out.println("ActionCharacter::fight()");
	}

}
class Hero extends ActionCharacter implements CanFly,CanSwim,CanFight{

    @Override
	public void fly(){
		System.out.println("Hero::Fly");

	}
	@Override
	public void swim(){
		System.out.println("Hero::swim");
	}
	void v3(){
		System.out.println("Normal");
	}
}

public class App{
	//CanFly cf=new Hero();
	
	
	static void u(CanFly cf){
		cf.fly();
	}
	//CanFight cf = new Hero();
	static void v(CanFight cft){
		cft.fight();
	}
	static void w(CanSwim cs){
		cs.swim();
	}

	public static void main(String[]args){

		Hero hero=new Hero();

		// CanFly cf =new Hero();
		// CanFight cft =new Hero();
		// CanSwim cs =new Hero();

		// cf.fly();

		u(hero);
		v(hero);
		w(hero);
	}
	
}