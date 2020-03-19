package app;

public class Square extends ClosedCurve implements Polygon {
	double side;

	public Square(Double side) {
		this(side.doubleValue());
	}

	public Square(double side) {
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

	@Override
	public String getShape() {
		return "Square";
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return side*4;
	}
}