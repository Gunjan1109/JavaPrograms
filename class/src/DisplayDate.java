import java.util.*;
class Date{
	int month;
	int day;
	int year;

	Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
    Date(){}
	void Display(){
		System.out.print(month+ "/");
		System.out.print(day + "/");
		System.out.println(year);
	}

}

class DisplayDate{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int d,m,y;
		Date r = new Date();
		r.Display();
		d = input.nextInt();
		m = input.nextInt();
		y = input.nextInt();
		Date r1 = new Date(d,m,y);
		r1.Display();

	}
}