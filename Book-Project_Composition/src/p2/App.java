package p2;

import p1.Book;
import p1.Auther;

public class App{

	public static void main(String[]args){

		Auther a1=new Auther("vishal","visha@",'m');


		Book b1=new Book("vishal 2",a1,4336,25);

		System.out.println(a1.toString());
		System.out.println(b1.toString());

	   System.out.println(a1.getName());

		System.out.println(b1.getName());
      a1.setName("ggjh");
      		System.out.println(a1.getName());



	}

}
