package PracticeInterface;

public interface Employee {
	
	
	void calculateSalary();
	
	void displayBenefits();

}


//Scenario: An organization has multiple types of employees (FullTime, PartTime, Contract) with different compensation structures.
//
//Question: Define an Employee interface with methods like calculateSalary() and getBenefits().
//Create classes FullTimeEmployee, PartTimeEmployee, and ContractEmployee that implement this interface, each with its own logic for salary and benefits.
//
//Objective: Illustrate how an interface can help define common behavior while allowing each type of employee to implement unique logic for salary and benefits.