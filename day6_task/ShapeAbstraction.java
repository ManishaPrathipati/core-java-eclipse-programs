package day6_task;

public class ShapeAbstraction {

	public static void main(String[] args) {

		System.out.println("Shape Categorization is as Follows:");
		SideCategory sc=new SideCategory();
		ShapeAbs a = sc.shapeAbs();
				a.triangleBA();
				a.triangleBS();
				a.square();
				a.recatngle();
				a.pentagon();
				a.hexagon();
	}

}
