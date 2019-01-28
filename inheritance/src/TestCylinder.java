class Circle{
	private double radius;
	private Sring Color;

	Circle(){
		radius = 1;
		Color = "Red";
	}

	Circle(double radius){
		this.radius = radius;
	}

	Circle(double radius, String Color){
		this.radius = radius;
		this.Color = Color;
	}

	double getradius(){
		return radius;
	}

	void setradius(double radius){
		this.radius = radius;
	}
	String getColor(){
		return Color;
	}
	void setColor(String Color){
		this.Color = Color;
	}

	double getArea(double radius){
		return 3.14*radius*radius;
	}
}

class Cylinder extends Circle(){
	private double height;

	Cylinder(){
		height = 1;
	}

	Cylinder(double radius){
		this.radius = radius;
	}
	Cylinder(double radius, String Color){
		th 
	}
}