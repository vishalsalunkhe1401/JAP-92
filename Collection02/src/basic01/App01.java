package basic01;
import java.util.ArrayList;

public class App01 {

	public static void main(String[]args) {
		
		ArrayList<String> friends=new ArrayList<>();
		
		friends.add("Vishal");
		friends.add("Gaurav");
		friends.add("Jay");
		friends.add("Rohan");
		friends.add("Shreenath");
		
		System.out.println(friends.contains("Rohan"));
	}
}
