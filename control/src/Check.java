import java.util.Scanner;
class Check{
	public static void main(String[] args) {
		float a,b;
 		Scanner input = new Scanner(System.in);
		a = input.nextFloat();
		b = input.nextFloat();
		a = a*1000;
		b =b*1000;
		int c = (int) a;
		int d = (int) b;
		if(c != d)
			System.out.print("Entered number are not equal");
		else
			System.out.print("Entered number are  equal");


	}
}