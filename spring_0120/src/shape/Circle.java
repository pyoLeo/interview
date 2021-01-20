package shape;

public class Circle implements IShape {
	public int rad;
	
	public Circle(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return rad*rad*3.14;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
}
