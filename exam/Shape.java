package exam;

public abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();
	
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
				rec.calculateArea();
				rec.calculatePerimeter();
		Circle circle=new Circle();
				circle.calculateArea();
				circle.calculatePerimeter();
		Triangle triangle=new Triangle();
				triangle.calculateArea();
				triangle.calculatePerimeter();
	}
}
