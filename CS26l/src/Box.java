
public class Box extends Rectangle{
	private double height;
	
	public Box(){
		
	}
	public Box(double x, double y, double z) {
		this.height = z;
	    super.setDimension(x, y);
	}
	public void setDimension(double x, double y, double z) {
		this.height = z;
	    super.setDimension(x, y);
	}
	public double getHeight() {
		return height;
	}
	public double area() {
		double area = super.getLength()*height;
		return area;
	}
	public double volume() {
		double volume = height*super.getLength()*super.getWidth();
		return volume;
	}
	public String toString() {
		return "Length: "+getLength()+" Width: "+getWidth()+" Heigth: "+height;
	}

}
