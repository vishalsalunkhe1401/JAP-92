import java.util.Random;
class Employee{
	  
	  private int id;
	  private String firstName="";
	  private String lastName="";
	  private double salary;

	  private Random generator=new Random();


	  Employee(){
	  	    // check field intilization
	  	    salary=0.0;
	  		id=generator.nextInt(1000);
	  
	  }

	  Employee(String firstName,String lastName,double salary){
	  		this.firstName=firstName; this.lastName=lastName; this.salary=salary;
	  		id=generator.nextInt(1000);
	  
	  }
	  public int getId(){return id;}
	  // not setter

	  public String getFullName(){
	  	 return firstName+"  "+lastName;
	  }

	  public String getFullDetails(){
	  	return id +" "+ firstName +" " + lastName +" "+ salary; 
	  }

}

public  class App1{
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee("Vishal","Salunkhe",10000);
		Employee e3=new Employee("Sushant","Salunkhe",11000);
		Employee e4=new Employee("Vighnesh","Salunkhe",15000);

		System.out.println(e1.getId());
		System.out.println(e2.getId());
		System.out.println(e3.getId());
		System.out.println(e4.getId());

		System.out.println(e1.getFullName());
		System.out.println(e2.getFullName());
		System.out.println(e3.getFullName());
		System.out.println(e4.getFullName());

	
        System.out.println(e1.getFullDetails());
		System.out.println(e2.getFullDetails());
		System.out.println(e3.getFullDetails());
		System.out.println(e4.getFullDetails());


	}
}