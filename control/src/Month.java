// To display the month name according to their number
import java.util.Scanner;
class Month
{
	public static void main(String args[]) {
		int a,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to exit from the program");
        do
        {
        	n = input.nextInt();
        	switch(n)
        	{
        		case 1: System.out.println("January");
        		        break;
        		case 2:  System.out.println("Febuary");
        		        break;
        		case 3: System.out.println("March");
        		        break;	
        		case 4: System.out.println("April");
        				break;
				case 5: System.out.println("May");
						break;
				case 6: System.out.println("June");
						break;
				case 7: System.out.println("July");
						break;
				case 8: System.out.println("Augest");
						break;
				case 9: System.out.println("September");
						break;
				case 10: System.out.println("October");
						break;
				case 11: System.out.println("November");
						break;
				case 12: System.out.println("December");
						break;
				default: System.out.println("Please enter number only between 1 and 12");		

				


        	}
        }while(n!=0);
	}
}