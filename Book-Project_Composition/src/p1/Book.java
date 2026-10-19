package p1;
public class Book{

	private String name;
	private Auther auther;
	private double price;
	private int qty;

	public Book(String name,Auther auther,double price,int qty){

		this.name=name; this.auther=auther; this.price=price; this.qty=qty;

	}

	public String getName(){
		return name;

	}
	public Auther getAuther(){
		return auther;
	}

	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}

	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty=qty;
	}

	public String  toString(){
		return " name "+name+" auther "+auther+" price "+price+" qty "+qty;
	}
}