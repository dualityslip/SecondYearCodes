
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		
	}
	public Rectangle(double x, double y) {
		this.length =x;
		this.width = y;
	}
	public void setDimension(double x, double y) {
		this.length =x;
		this.width = y;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double area() {
		double area = getLength()*getWidth();
		return area;
	}
	public double perimeter() {
		double perimeter = 2*(getLength()+getWidth());
		return perimeter;
	}
	public String toString() {
		return "Length: "+getLength()+" Width: "+getWidth();
	}
	
	
	
;
}
