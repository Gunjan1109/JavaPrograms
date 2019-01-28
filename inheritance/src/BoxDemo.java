import java.util.*;
class Rectangle{
	Scanner input = new Scanner(System.in);
	 double lenght;
	 double width;

	double getLenght(){
		return lenght;
	}
	double getWidth(){
		return width;
	}
	void setDimension(double lenght, double width){
		this.lenght = lenght;
		this.width = width;
	}

	double area(){
		return lenght* width;
	}
	double perimeter(){
		double p;
		p = lenght+width;
		return p;
	}
	void displayR(){
		System.out.println("Area of Rectangle is :"+area());
		System.out.println("perimeter of Rectangle is :" + perimeter());


	}
}

class Box extends Rectangle{
	 double height;


	void setDimension(double lenght, double width,double height){
		this.lenght = lenght;
		this.width = width;
		this.height = height;
	}
	double getheight(){
		height = input.nextDouble();
		return height;
	}
	
	double Volume(){
		return lenght*width*height;
	}
	void display(){
		System.out.println("Area of Box is :"+ area());
		System.out.println("Volume of Box is :"+ Volume());
	}
}
class BoxDemo{
	public static void main(String[] args) {
		double l,w,h,a,v,p;
		System.out.println("Enter lenght and width for Rectangle");
		Box B = new Box();
		l = B.getLenght();
		w = B.getWidth();	
		B.setDimension(l,w);
		B.displayR();
		l =B.getLenght();
		w = B.getWidth();
		h = B.getheight();
		B.setDimension(l,w,h);
		B.display();
	}
}