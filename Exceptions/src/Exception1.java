import java.util.*;

class Exception1{
	public static void main(String[] args) {
		int a=1,b,c;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a and b");
     try {
		a = input.nextInt();
		b = input.nextInt();
		c = a/b;
	}
		
		catch(ArithmeticException e){
			System.out.println("Hello Again"+ e.toString());
			b = 1;

		}
		catch(Exception e){
			System.out.println("Hello "+ e.toString());
			b = 1;
		}

		c = a/b;

		System.out.println("\na ="+ a + " b = " + b + " a/b" + c);
	}
}