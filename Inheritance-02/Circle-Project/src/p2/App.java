package p2;

import p1.Circle;
import p1.Cylineder;

public class App{
	
	public static void main(String[]args){


		Cylineder s1=new Cylineder(2.4,5);

		 s1.getInfo();

		 s1.setRadius(2.4);

		 System.out.println("RAdius:"+s1.getRadius());
	     System.out.println("Color:"+s1.getColor());

	   	 System.out.println("Height:"+s1.getHeight());
	   	 System.out.println("Volume:"+s1.getVolume());
		 System.out.println("Area"+s1.getArea());




	}
}