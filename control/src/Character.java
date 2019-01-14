//To che k whether entered character is vowel or consonent
import java.util.Scanner;
class Character
{
	public static void main(String[] args) {
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character");
		ch = input.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A') &&(ch<='Z'))
			{  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
				System.out.println("Entered character is a vowel");
  				else
  					System.out.println("Entered character is a consonent");

	}
	else
		System.out.println("Entered character is not a character"); 
}
}