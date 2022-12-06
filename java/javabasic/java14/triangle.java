package d19;

public class triangle {
	double width;
	double height;
	
	public void trisetSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {

		return (int) ((width*height)/2);

	}

}
