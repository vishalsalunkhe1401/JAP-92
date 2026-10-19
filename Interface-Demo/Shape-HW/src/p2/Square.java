package p2;
public class Square extends Rectangle{
	protected double side = 1.0;

	public Square(){};

	public Square(double side){
		super(side,side);

	}
	public Square(double side,String color,boolean filled){
		super(side,side,color,filled);

	}

	public double getSide(){
		return super.getWidth();
	}
   public void setSide(double side){
   	  super.setWidth(side);
   	  super.setLength(side);

   }

   @Override
   public String toString(){
   	return super.toString();
   }
}