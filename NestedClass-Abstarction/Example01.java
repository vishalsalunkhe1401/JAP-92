interface PContent{

	void showContent();
}

class Parcel{

	private String label="ABCD";


	private class Content implements PContent{
      
       private String item="YELLOW";

      @Override
      public void showContent(){
      	System.out.print(item);

      }

	}

	public void showDetails(){
		System.out.print(label);
	}
	public PContent getContent(){
		return new Content();
	}
}

public class Example01{
	public static void main(String[] args) {
		
		Parcel p1=new Parcel();
		PContent c1=p1.getContent();
		c1.showContent();
	}

	
}