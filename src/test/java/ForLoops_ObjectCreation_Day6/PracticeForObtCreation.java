package ForLoops_ObjectCreation_Day6;



	class Student {
		
		String name;
		int age;
		String courseName;
		
		public void display() {
			
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Course:"+courseName);
		}
			
		
	}
	
	/*
	 * class Numbers {
	 * 
	 * int udigit; int tdigit; int hdigit;
	 * 
	 * }
	 */
		
	public class PracticeForObtCreation {
		
	public static void main(String[] args) {


		Student s2=new Student();
		
		s2.name="Daniel";
		s2.age=34;
		s2.courseName="Selenium";
		
		s2.display();
		
		
		
		
		
		/*for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}

		System.out.println("***********************");

		
		 * for (int i=100;i>0;i-=2) {
		 * 
		 * System.out.println(i); }
		 

		for (int j=0;j<20;j+=4)

		{
			if (j==12)
				continue;

			else

				System.out.println("Print value of j:" +j);
		}
		System.out.println("***********************");

		for (String s="Hello!!";s.length()<10;s=s+"@")
		{
			System.out.println(s);
		}*/

	}


}
