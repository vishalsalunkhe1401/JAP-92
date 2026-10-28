package basic;
import java.util.ListIterator;
import java.util.ArrayList;

public class App1 {
	
	public static void main(String[] args){
		
		ArrayList<String>friends=new ArrayList<String>();
		
		friends.add("Kareena");
		friends.add("Raveena");
		friends.add("Anup");
		friends.add("katrina");
		friends.add("Rahul");
		
		//System.out.println(friends.get(10));
		
		friends.set(0, "Deepika"); //replace
		System.out.println(friends);
		friends.add(0,"Shraddha");
		System.out.println(friends);
		
		System.out.println("remove : "+friends.remove(0));
		System.out.println(friends);
		
		System.out.println("------------------------------------------------");
		
		ListIterator<String>litr=friends.listIterator(friends.size());
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		ListIterator<String>litr1=friends.listIterator();
		System.out.println("******* 1*******");
		
		while(litr.hasPrevious()) {
			System.out.println(litr1.next());
		}
		System.out.println("******** 2************");
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		
		System.out.println("================================");
		
		ListIterator<String> litr2=friends.listIterator(3);//with specific size
		
		while(litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}

		

		
		
	}

}
