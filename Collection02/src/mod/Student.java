package mod;
import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private double marks;

	public Student() {

	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student[Id=" + id + ",Name=" + name + ",Marks=" + marks + "]";

	}


//	public static void main(String[]args) {
//		Student s1=new Student(1,"vishal",77);		
//String val=s1.getName();
//System.out.println(val);
//		System.out.println(s1);	
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,marks,name);
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
		return false;
		
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)&& Objects.equals(name, other.name);
				
		
		
	}
	
  
}
