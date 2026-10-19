public class Watch{
	
	int hours;
	int minutes;
	int seconds;

	public void displayTime(){

		System.out.println("Hr: "+ hours + " Minute: "+minutes +" Second: " + seconds);
	}

	public void setHour(int hr){
		if(hr>=1 && hr<=24){
			hours=hr;
		
		System.out.println(hours);
         }else{
			System.out.println("Hour valid is not valid");
		}

}
		public void setMinute(int min){
		       minutes=min;
		       System.out.println(minutes);
		}

		public void setSecond(int sec){

			seconds=sec;
			System.out.println(seconds);

		}

		
	}

