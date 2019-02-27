package pointInRectangle;

public class Rectangle {
	Point topLeft;
	Point bottomRight;
	
	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public boolean contain(Point point) {
		boolean isInside = true;
		
		if (topLeft.getCoordinateX() > point.getCoordinateX()) {
			return false;
		}
		
		if (bottomRight.getCoordinateX() < point.getCoordinateX()) {
			return false;
		}
		
		if (topLeft.getCoordinateY() > point.getCoordinateY()) {
			return false;
		}
		
		if (bottomRight.getCoordinateY() < point.getCoordinateY()) {
			return false;
		}
		
		return isInside;
	}
}
