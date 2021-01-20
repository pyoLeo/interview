package hw;

public class Tri {
	private int width;
	private int height;
	
	public Tri() {}
	public Tri(int width, int height) {
		this.width = width;
		this.height = height;
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
	public double getArea() {
		return height * width / 2;
	}
}
