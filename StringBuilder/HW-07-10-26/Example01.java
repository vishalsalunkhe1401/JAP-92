
public class Example01{

	public static String revereseSetWord(String input){
		if(input==null)
			return "";
		if(input.length()==1)
			return input;

		if(input.trim().length()==0)
			return "";

         StringBuilder temp1;

         String words[]=input.split(" ");
         StringBuilder res = new StringBuilder();
         int i;
         for(i=0; i<words.length-1;i++){
          temp1 = new StringBuilder(words[i]);
         	temp1.reverse();
         	 res.append(temp1).append(" ");

         }
         if(i<words.length){
         	temp1=new StringBuilder(words[i]);
         	temp1.reverse();
         	res.append(temp1);

         }
         return res.toString();




	}

	
	public static void main(String[] args) {

		  String input = "Vishal Become A Software Developer";
		   String output=revereseSetWord(input);
		System.out.println(output);
		

	}
}