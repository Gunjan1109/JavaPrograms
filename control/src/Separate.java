//Program to separate the digits rom a given number
import java.util.Scanner;
class Separate
{
	public static void main(String[] args) {
		int n,m;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A 5 digit number");
		n = input.nextInt();
		while(n>0)
		{
			m = n%10;
			System.out.println(m+"   ");
			n = n/10;
		}
	}
}