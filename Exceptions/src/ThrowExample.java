import java.util.*;
class ThrowExample{
	public static void main(String[] args) {
		int day;
		Scanner input = new Scanner(System.in);
		try{
 			System.out.println("Enter a day");
 			day = input.nextInt();
 			if(day<0||day>31)
			throw new ArithmeticException("Exception throw by throw");
		else
			System.out.println("Entered day is " + day);
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("\n" + e.getMessage());
		}
		finally{
			System.out.println("Finally");
		}
	}
}
