import java.util.*;

class Exceptionwithfunction{
	static void abc() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int a,b,c;
		int[] d = {2};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values of and b");
		a = input.nextInt();
		b = input.nextInt();
		c = a/b;
		System.out.println("A / B is " + c);
		d[4]  =4;
	}

	public static void main(String[] args) {
		try{
			abc();
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array bound exception");
		}
	}
}