package com.vs;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		List<Integer>value=new ArrayList<Integer>();
		
		value.add(11);
		value.add(22);
		value.add(33);
		value.add(44);
		value.add(55);
		
		
//		Iterator<Integer>itr=value.iterator();
//		
//		while(itr.hasNext()) {
//			Integer val=itr.next();
//			
//			if(val==33)
//				value.remove(val); // Exception in thread "main" java.util.ConcurrentModificationException
//			
//		}
		
		Iterator<Integer>itr1=value.iterator();
		
		while(itr1.hasNext()) {
			Integer val=itr1.next();
			if(val==33)
				itr1.remove();
		}
		System.out.println(value);
		
	}
}
