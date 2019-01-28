import java.util.*;

class Exception2{
	public static void main(String[] args) {
		int a,b,c;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		a = input.nextInt();
		b = input.nextInt();
		c = a/b;
		System.out.println("\na ="+ a + " b = " + b + " a/b" + c);
	}
}