package d19;

public class TV {

	// TODO Auto-generated method stub
	String brand; // 색상
	int year; // 년도
	int size; // 크기

	TV(String a, int b, int c) {
		brand = a;
		year = b;
		size = c;
	}

	public void show() {
		System.out.println(brand + "제품 " + year + " 년형 " + size + "인치 TV");
	}
}
