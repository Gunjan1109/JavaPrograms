/*	Create a class Employee that includes the following: name, year of joining, salary, address. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities by displaying the output as follows for: (50 minutes)
Name        Year of joining        Address
Ram        1994                64CVasant Kunj 110070
Sam            2000                68DDwarka 110037
Ana 1999                26B R.K Puram 110022

Definition of Done:
b)	Two java files to be defined. One for class definition and another for the application.
c)	The application should have the following functionality: 
i.	Ask the user for the number of employees for which information is required. 
ii.	An Employee array of appropriate size should be defined based on the user input.
iii.	Display the information of all the employees in a tabular format.
d)	Class Employee should include the following functions: 
i.	Appropriate parameterized and non-parameterized constructors
ii.	Display method*/
import java.util.*;
class Employe{
	String name;
	int yoj;
	double salary;
	String address;

	Employe(){
		name = "NULL";
		yoj = 0;
		salary = 0.0;
		address = "NULL";
	}

	Employe(String n, int y, double s, String a){
		name = n;
		yoj = y;
		salary = s;
		address = a;
	}

	Display(){
		
		System.out.print("\n"name + "         " + "            "+ address);
	}
}

class Employetest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employe E[] = new Employe();
		int i,q;
		System.out.println("How many number of employees you want to enter");
		q = input.nextInt();
		for(i = 0; i<q; ++i)
		{
		String n = input.nextLine();
		int y = input.nextInt();
		double s = input.nextDouble();
		String a = input.nextLine();
		Employe E[i] = new Employe(n,y,s,a);
	    }

	    System.out.println("name         Year of joining            Address");
	    for(i = 0; i<q; ++i)
	    {
	    	E[i].Display();
	    }

	}
}