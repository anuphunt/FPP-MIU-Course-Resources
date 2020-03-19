package app;

public class Square extends ClosedCurve {
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
	String getShape() {
		return "Square";
	}
}