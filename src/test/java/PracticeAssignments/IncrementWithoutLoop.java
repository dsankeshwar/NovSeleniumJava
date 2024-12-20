package PracticeAssignments;



public class IncrementWithoutLoop {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		increment(1);
			
	}

	public static void increment(int a) {
		
		if (a<=100 ) 
		{
			System.out.println(a);
			increment(a+1);
	}
		
	}
	
}
