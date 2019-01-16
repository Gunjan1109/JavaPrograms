import java.util.*;
class Circle{

	double radius;

	double findArea(){
		return radius * radius * 3.14;	
	}

	void displayArea(){
		System.out.println("Area of circle is" + findArea());
	}
}

class CircleDemo{
	public static void main(String args[]) {
		Circle c = new Circle();
		Scanner input = new Scanner(System.in);
		c.radius = input.nextDouble();
		c.displayArea();
		
	}
}