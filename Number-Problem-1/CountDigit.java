
public class CountDigit{

int cnt=0;

public void FindLast(int num){
      while(num>0){
      	num=num/10;
      	cnt++;


      }


  System.out.println(cnt);

}

	public static void main(String[]args){

		CountDigit f1=new CountDigit();

		f1.FindLast(1234);



		

	}
}