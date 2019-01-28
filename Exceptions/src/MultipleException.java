import java.util.*;

class Multicatch{
	public static void main(String[] args) {
		try{
			int a,b,c;
			int[] d = {2};
			Scanner input = new Scanner(System.in);
			a = input.nextInt();
			System.out.println("a = "+ a);
			b = input.nextInt();
			System.out.println("b = "+ b);
			c = a/b;
			d[2] = 99;
		}
			catch(ArithmeticException e){
				System.out.println("Divided by 0: " + e);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index of:"+ e);
			}
			System.out.println("After try and catch blocks");

			}
		}
	
