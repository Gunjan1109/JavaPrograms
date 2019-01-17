/*1.	Create a class Circle with instance variable radius and member functions:
a)	area( ) b) circumference( ) c) display( ). Write a test application named CircleTest that demonstrates class Circle’s capabilities.*/

import java.util.*;
class Circle{

	double radius;

	double Area(){
		return radius * radius * 3.14;	
	}
	double Circumference(){
		return 2*3.14*radius;
	}

	void Display(){
		System.out.println("Area of circle is" + Area());
		System.out.println("Circumference of circle is" + Circumference());

	}
}

class CircleTest{
	public static void main(String args[]) {
		Circle c = new Circle();
		Scanner input = new Scanner(System.in);
		c.radius = input.nextDouble();
		c.Display();
		
	}
}
