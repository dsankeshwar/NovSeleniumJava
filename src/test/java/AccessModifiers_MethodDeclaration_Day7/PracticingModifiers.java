package AccessModifiers_MethodDeclaration_Day7;

public class PracticingModifiers {

	public static void main(String[] args) {
		
		display();
		
		System.out.println(sum(44,34));
		System.out.println(sum(20.0,33));
		System.out.println(sum(33,33.0));
		System.out.println(sum(22,22,33));
		System.out.println(sum(33.0,33.22));
	}
	
	private static void display()
	{
		System.out.println("This is printing from Private method");
	}
	
	static int sum(int a, int b)
	{
		return a+b;
	}

	static double sum(double a, int b)
	{
		return a+b;
	}
	
	static double sum(int a, double b)
	{
		return a+b;
	}
	static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	static double sum(double a, double b)
	{
		return a+b;
	}
}
