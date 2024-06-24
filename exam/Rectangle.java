package exam;

public class Rectangle extends Shape{

	int l=12, b=20;
	@Override
	void calculateArea() {
		System.out.println("Area of Rectangle is: "+(l*b));
	}

	@Override
	void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle is: "+(l+b));
	}
	
}
