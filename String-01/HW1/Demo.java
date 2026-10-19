//    Write a Java  program to find the highest frequency character in a string.

public class Demo{

	public static int highestFrequency(String str){


		int index=0;
		int ans=0;
		
		for(int i=0;i<str.length();i++){
			int cnt=0;
			for(int j=0;j<str.length();j++){
				
				if(str.charAt(i)==str.charAt(j)){

					cnt++;
				}
				if(ans<cnt){
					ans=cnt;

					index=i;

				}

			}
		}


		return index;

		
	}

	public static void indexOfAllMax(String str, int index){

		char ch=str.charAt(index);


		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "abccddddd";

		

		indexOfAllMax(str,highestFrequency(str));

		
	}
}