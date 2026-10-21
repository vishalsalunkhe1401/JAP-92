class Point{
	int x; int y;
	Point(){}

	Point(int x,int y){
		this.x=x;this.y=y;
}
		//copy constructor
		//is there copy constructor in java ? NO
		//but we can write copy constructor

		Point(Point other){
			this.x=other.x;
			this.y=other.y;

		
	}
}




public class App{
	public static void main(String[] args) {
		
		Point p1=new Point(11,22);

		Point p2=new Point(p1);//copy constructor
	}
}