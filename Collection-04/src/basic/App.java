package basic;
import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>numbers=new LinkedList<>();
		
		numbers.add(11); numbers.add(12); numbers.add(13); numbers.add(14); numbers.add(13); numbers.add(15);
		
		System.out.println(numbers);
		
		numbers.addFirst(10);
	
		System.out.println(numbers);
		
		numbers.addLast(16);
		System.out.println(numbers);
		
		numbers.remove(new Integer(13));
		System.out.println(numbers);
		
		numbers.remove(0);
		System.out.println(numbers);
		

		numbers.remove(2);
		System.out.println(numbers);
		
		numbers.add(2,13);
		System.out.println(numbers);
		
		
		System.out.println(numbers.get(2));
		
		int val=numbers.getFirst();
		System.out.println(val);
		
		System.out.println(numbers.getLast());
		
		System.out.println(numbers);
		numbers.set(0,9);
		System.out.println(numbers);
		
		System.out.println(numbers.removeFirst());
		System.out.println(numbers);
		
		System.out.println(numbers.removeLast());
		System.out.println(numbers);
		
		System.out.println(numbers.contains(17)); //false
		
		System.out.println(numbers.contains(15)); //true
		
		System.out.println(numbers.size()); // size
		
		System.out.println(numbers.isEmpty()); // if empty then give true othrer wise false
		
//		numbers.clear();
//		System.out.println(numbers);  //remove all values
//	
		System.out.println(numbers);
		System.out.println(numbers.indexOf(13));
		
		System.out.println(numbers.lastIndexOf(13));
		}

}
