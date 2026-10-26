import java.util.List;
import java.util.ArrayList;


public  class Example07{
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		List<Integer> list2 = new ArrayList<>();

		list2.add(4);
		list2.add(5);

		System.out.println(list);
		System.out.println(list2);

		System.out.println("---------------------");

		list.retainAll(list2);

		System.out.println(list);
		System.out.println(list2);



	}
}