package exam;

public class Circle extends Shape{

	int r=10;
	@Override
	void calculateArea() {
		System.out.println("Area of Circle is: "+(2*3.14*r*r));
	}

	@Override
	void calculatePerimeter() {
		System.out.println("Perimeter of Circle is: "+(2*r));
		
	}

}
