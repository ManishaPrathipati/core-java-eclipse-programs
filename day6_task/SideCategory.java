package day6_task;

public class SideCategory{
	private class ShapeSides implements ShapeAbs{

		public void triangleBS() {
			System.out.println("We have 3 types of Side based Triangles having 3 sides: They are \n 1. Equilateral\n 2. Scalene\n 3. Isosceles");
		}

		public void triangleBA() {
			System.out.println("We have 3 types of Angle based Triangles having 3 angles: They are \n 1. Right Angle\n 2. Obtuse\n 3. Acute");
		}

		public void square() {
			System.out.println("Square Contains 4 equal sides");
		}

		public void recatngle() {
			System.out.println("Rectangle Contains 4 sides, Here the Opposite Sides are equal");
		}

		public void pentagon() {
			System.out.println("Pentagon Contains 5 sides");
		}

		public void hexagon() {
			System.out.println("Hexagon Contains 6 sides");
		}

	}
	
	public ShapeAbs shapeAbs() {
		return new ShapeSides();
	}

}