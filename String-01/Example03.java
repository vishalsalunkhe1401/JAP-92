public class Example03{
	
	public static void main(String args[]){

		String s1=new String();
		String s2=new String("India");
		String s3="Hello";
		String s4=new String(s3);

		char fruit[]={'A','P','P','L','E'};

		String s5=new String(fruit);

		byte numbers[]={65,66,67,68,69};

		String s6=new String(numbers);

		//StringBuilder
		//StringBuffer

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);


	}
}