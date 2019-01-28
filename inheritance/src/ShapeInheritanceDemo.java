import java.util.*;
class Shape{
	public void displayMsg(){
		System.out.println("This is a shape");
	}
}
class Circle extends Shape{
	int radius;

	Circle(int radius){
		this.radius = radius;
	}

	double area(){
		return 3.14*radius*radius;
	}
	void displayArea(){
		System.out.println("Area of circle = " + area());
	}
}

class Rectangle extends Shape{
	int lenght, breadth;

	Rectangle(int lenght, int breadth){
		this.lenght = lenght;
		this.breadth = breadth;
	}

	double area(){
		return lenght*breadth;
	}

	void displayArea()
	{
		System.out.println("Area of Rectanlge = "+ area());
	}
}

class ShapeInheritanceDemo{
	public static void main(String[] args) {
		
	Circle c = new Circle(4);
	System.out.println("Circle calling its function and inheritance");
	c.displayArea();
	c.displayMsg();

	Rectangle r = new Rectangle(6,5);
    System.out.println("Circle calling its function and inheritance");
	r.displayArea();
	r.displayMsg();


}
}