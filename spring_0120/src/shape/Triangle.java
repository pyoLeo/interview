package shape;

public class Triangle implements IShape {
	public int width;
	public int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height / 2;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
