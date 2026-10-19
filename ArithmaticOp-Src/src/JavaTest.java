public class JavaTest{
	public static void main (String[]args){

		Student s1=new Student();

		s1.name="vishal";
		s1.city="Pune";
		s1.rollNo=21;
		s1.age=24;
		

		System.out.println(s1.name);
		 System.out.println(s1.city);
		System.out.println(s1.rollNo);
        System.out.println(s1.age);



          s1.study();
          s1.attendClass();
          s1.giveExam();


		
	}
}