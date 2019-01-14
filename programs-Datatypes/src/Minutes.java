//To convert minutes into days ,years and months

class Minutes
{
	 public static void main(String args[]) {
		int a = 9600000;
		int b = 9600000/(60*24);
		int y = b/(365);
		System.out.println("9600000 in years is \n"+ y);
		int m = (b%365)/12;
		System.out.println("9600000 in months is \n"+ m);
		int d = m%12;
		System.out.println("9600000 in days is \n"+ d);

	}
}