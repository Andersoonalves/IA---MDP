package model;

public class Point {
	private int x;
	private int y;
	private Integer value;

	public Point(int x, int y, Integer value) {
		this.x = x;
		this.y = y;
		this.value = value;

	}

	public Integer getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", value=" + value + "]";
	}

}
