package basic1;
//import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

public class App{
	public static void main(String[] args) {
		
		ArrayList<Integer>l1=new ArrayList<Integer>();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		
		System.out.println(l1);
		l1.addFirst(10);
	    System.out.println(l1);
	    
	}
}