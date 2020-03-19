package app;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Circle(3), new Rectangle(3, 7) };

		for (ClosedCurve cc : objects) {
			System.out.printf("The area of this %s is %.2f\n", cc.getShape(), cc.computeArea());
		}
	}

}