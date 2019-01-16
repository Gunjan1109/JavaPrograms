import java.util.*;
class Box{
	double width;
	double height;
	double depth;
	Box(){
		width = 5;
		height = 5;
		depth = 5;
	}
	Box(double width, double heigth, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	double Volume(){
		return(width*height*depth);
	}
	}


class BoxDemo{
	public static void main(String args[]) {
		double s,t;
		Box c = new Box();
	    Box b = new Box(6,6,6);
		s = c.Volume();
		t = b.Volume();
		System.out.println("The volume with parametrised constructor" + s);
		System.out.println("The volume with simple constructor is " + t);
	}
}