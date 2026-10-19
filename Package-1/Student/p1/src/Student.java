package p1;
//default

public class Student{
	private int id;
	private String name;
	private double marks;

	public Student(){}

	public Student(int id,String name,double marks){
		this.id=id; this.name=name; this.marks=marks;
	}
	public void displayStudent(){
		System.out.println("ID :" +id);
		System.out.println("NAME :" +name);
		System.out.print("MARKS :" +marks);
	}
	//public setter
}   //public getter