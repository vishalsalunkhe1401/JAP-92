package p1;

public interface Shape{

	



	public String getColor();
	public void setColor(String colour);
	public boolean isFilled();
   
  public void setFilled(boolean filled);
  	

  public abstract double getArea();
  public abstract double getPerimeter();

  public abstract String toString();
	
	
}