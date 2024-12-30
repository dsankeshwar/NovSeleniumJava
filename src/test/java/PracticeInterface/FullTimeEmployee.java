package PracticeInterface;

public abstract class FullTimeEmployee implements Employee {

	 public void calculateSalary() {

		System.out.println("Calculate the Salary");
		
	}

	public void getBenefits() {

		System.out.println("Calculate the Benefts");
		
	}

		
public abstract class PartTimeEmployee implements Employee {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

	public void getBenefits() {
		// TODO Auto-generated method stub
		
	}

		
}

public abstract class ContractEmployee implements Employee {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

	public void getBenefits() {
		// TODO Auto-generated method stub
		
	}

	
}


}
