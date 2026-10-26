import  java.util.ListIterator;
import  java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
class Student{
	int rollno;
	String name;
	int marks;

		public Student(int rollno, String name, int marks){
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}

		public Student(){}


		//GETTER 
		//SETTER

		@Override
		public String toString(){
			return "Roll no: "+rollno+"  Name : "+name+"  Marks :"+marks;
		}


}



public  class Example08{
	public static void main(String[] args) {

		// Student s1 = new Student(1,"Shrenath1",99);
		// Student s2 = new Student(2,"Shrenath2",98);
		// Student s3 = new Student(3,"Shrenath3",97);
		// Student s4 = new Student(4,"Shrenath4",96);
		// Student s5 = new Student(5,"Shrenath5",95);



		// List<Student> list = new ArrayList<>();

		// list.add(s1);
		// list.add(s2);
		// list.add(s3);
		// list.add(s4);
		// list.add(s5);

		// System.out.println(list);

		Student str[]=new Student[5];

		for(int i=0;i<str.length;i++){
			str[i] =new	 Student(i+1,"Shrenath"+(i+1)+"",88+i);
		}

		List<Student> list2 = new ArrayList<>();

		for(int i =0;i<str.length;i++){
			list2.add(str[i]);
		}

		System.out.println("------------------------");


		Iterator<Student> itr = list2.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("********************");

		ListIterator<Student> li = list2.listIterator();

		while(li.hasNext()){
			System.out.println(li.next());
		}

		while(li.hasNext()){
			System.out.println(li.next());
		}


		System.out.println("********************");


		while(li.hasPrevious()){
			System.out.println(li.previous());
		}

		System.out.println("********************");
		ListIterator<Student> li2 = list2.listIterator(list2.size());

		while(li2.hasPrevious()){
			System.out.println(li2.previous());
		}


		int arr[]={1,2,3,4,5,6};

		for(int val:arr){
			System.out.print(val+ " ");
		}
		System.out.println();
			System.out.println(arr[3]);


	





		
	}
}