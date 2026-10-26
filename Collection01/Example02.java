import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class Example02{
	public static void main(String[] args) {
		
		// Collection c1=new ArrayList<>();

		// List l1=new ArrayList<>();

		// List<String>friends=new ArrayList<>(); //Generic Collection

		List<String>friends=new ArrayList<String>(); 

		friends.add("Kareena");

        friends.add("Raveena");

        friends.add("Madhuri");

        friends.add("Karishma");

        friends.add("Katrina");

        System.out.println(friends);

	}
}