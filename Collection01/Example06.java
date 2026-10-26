import java.util.List;
import java.util.ArrayList;

public class Example06{
	public static void main(String[] args) {
		
   List<Integer>numbers=new ArrayList<>();

   numbers.add(11);
   numbers.add(22);
   numbers.add(33);
   numbers.add(44);
   numbers.add(55);

   //Object ob[]=numbers.toArray();

   Integer arr[]=new Integer[numbers.size()];
   numbers.toArray(arr);

for(Integer val:arr){
	System.out.print(val+" ");
	}
}
}