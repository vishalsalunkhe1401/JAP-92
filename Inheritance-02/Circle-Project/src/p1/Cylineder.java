package p1;

public class Cylineder extends Circle{

	private double height = 2.0;


     public Cylineder(){

     }

	public Cylineder(double radius){
		super(radius);
	}

	public Cylineder(double radius,double height){

		super(radius); 
		this.height=height;
	}

	public Cylineder(double radius,double height,String color){

		super(radius,color);
		this.height=height;
	}

	public double getHeight(){
		return height;
	}
	void setHeight(double height){
		this.height=height;
	}

	public double getVolume(){
		return 3.14*super.getRadius()*super.getRadius()*height;
	}
	public void getInfo(){
		System.out.println(getRadius());
	   System.out.println(getColor());  
		System.out.println(getHeight());
	}
}