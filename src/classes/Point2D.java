package classes;

public class Point2D {
	private double x;
	private double y;
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String show() {
		return "X co-ordinate :" + x + " " + "Y co-ordinate :" + y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public boolean isEqual(Point2D anotherObj) {
		if (this.x == anotherObj.x && this.y == anotherObj.y)
			return true;
		return false;
	}
	public double calcDist(Point2D point2d) {
		double dist = Math.sqrt(Math.pow(this.y - point2d.y, 2) + Math.pow(this.x - point2d.x, 2));
		return dist;
	}
}
