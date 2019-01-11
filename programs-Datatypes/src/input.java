import java.util.Scanner;
class Input{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int a,b,total,y,q;
	System.out.println("Enter Two numbers (a>b)");
	a = input.nextInt();
	b = input.nextInt();
	q = a+b;
	System.out.print("Addition of the numbers is " + q + "\n");
	y = a-b;
	System.out.print("Subtraction of the numbers is " +y+"\n");
	System.out.print("Multiplication of the numbers is " + a*b+"\n");
	System.out.print("Division of the numbers is " + a/b+"\n");
	System.out.print("Modulus of the numbers is " + a%b+"\n");
	}
}