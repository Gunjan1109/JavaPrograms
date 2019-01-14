//to calculate the roots of quadratic equation
import java.util.Scanner;
import java.lang.Math;
class quadratic{
	public static void main(String args[]) {
		double a,b,c,d,r1,r2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values of a, b and c");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = Math.sqrt((b*b)-(4*a*c));
		System.out.println("Value of d is" + d);
		if(d>0)
		{
			System.out.println("Roots are real and distinguished");
			r1 = (-b + d)/(2*a);
			r2 = (-b - d)/(2*a);
			System.out.println("Roots are "+ r1 +" and"+ r2);
		}
		else if(d==0)
		{
			System.out.println("Root are real and equal");
			r1 = r2= -b / (2 *a);

		}
		else
			System.out.println("Roots are not real");
	}
}