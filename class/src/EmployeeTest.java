/*3.	Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and 
a monthly salary (double). Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, 
ask the user to re-enter a positive value. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly
 salary again. 

Definition of Done:
a)	Two java files to be defined. One for class definition and another for the application.
a)	The Employee class definition should have the following functions:
i.	A non-parameterized constructor with default values defined by you.
ii.	A parameterized constructor with parameters for all the three instance variables.
iii.	Method to evaluate yearly salary
iv.	Method to evaluate raise in salary
v.	Method to display an employee’s information*/
import java.util.Scanner;
class Employee{
	String first_name, last_name;
	double monsal;

	Employee(){
		first_name = "NULL";
		last_name = "NULL";
		monsal = 0.0;
	}
	Employee(String f, String l, double m){
		first_name = f;
		last_name = l;
		monsal = m;
	}
	
	void Display(){
		System.out.println("Employee name is " + first_name + last_name);
		System.out.println("Monthly Salary is " + monsal);
	}
}

class EmployeeTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first_name = input.nextLine();
		String last_name = input.nextLine();
		double monsal = input.nextDouble();
		if(monsal < 0)
		{
			System.out.println("Salary cannot be negetive \n Enter again");
			monsal = input.nextDouble();
		}

		Employee E  = new Employee(first_name,last_name,monsal);
		E.Display();

	}
}