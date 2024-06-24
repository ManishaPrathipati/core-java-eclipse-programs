package exam;

public class Triangle extends Shape{

	int l=24, b=7, h=4;
	@Override
	void calculateArea() {
		System.out.println("Area of Triangle is: "+(l*b*h));
	}

	@Override
	void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle is: "+((1/2)*b*h));
	}

}
