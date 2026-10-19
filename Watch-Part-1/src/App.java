public class App{
	public static void main (String[]args){

		Watch fastrack=new Watch(); 
		fastrack.hours=8;
		fastrack.minutes=55;
		fastrack.seconds=12;

		System.out.println(fastrack.hours);

	    fastrack.displayTime();

	    fastrack.setHour(1);

	    fastrack.displayTime();

	    fastrack.setMinute(58);
	    fastrack.minutes=15;

	    fastrack.displayTime();

	    fastrack.setSecond(60);
	    fastrack.displayTime();



	    







         
         
	}
}
