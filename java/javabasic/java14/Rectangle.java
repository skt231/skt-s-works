package d19;

public class Rectangle {
	int width;
	int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() { // 면적(가로*세로)
		return width * height;
	}
}
