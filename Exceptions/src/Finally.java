import java.util.*;

class Finally{
	public static void main(String[] args) {
		int a=1,b,c;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a and b");
     try {
		a = input.nextInt();
		b = input.nextInt();
		c = a/b;
		System.out.println("a ="+ a + " b = " + b + " a/b " + c);
	}
		
		catch(ArithmeticException e){
			System.out.println("Exception"+ e.toString());
			b = 1;

		}

		finally{
			System.out.println("In finally");
		}

		
	}
}