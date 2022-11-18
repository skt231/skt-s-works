package bae02_class;

import java.util.Scanner;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class PhysicalExamination {

	private static final int VMAX = 21;// 시력 분포(0.0에서 0.1단위로 21개)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PhyscData[] x = { new PhyscData("박현규", 162, 0.3), new PhyscData("함진아", 173, 0.2),
				new PhyscData("최윤미", 175, 0.8), new PhyscData("홍연의", 162, 0.7), new PhyscData("이수진", 171, 0.9),
				new PhyscData("김영준", 169, 1.5), new PhyscData("박용규", 174, 0.3), };
		int[] vdist = new int[VMAX]; // 시력분포

		System.out.println("@신체검사 리스트@");
		System.out.println("이름		키	시력");
		System.out.println("---------------");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
//			System.out.printf("\n평균키 : %5.1/n", aveHeight(x));

			disvision(x, vdist); // 시력 분포를 구함

			System.out.println("\n시력분포");
			for (int i1 = 0; i1 < VMAX; i1++) {
				System.out.printf("%3.1f~ : %2d명\n", i1 / 10.0, vdist[i1]);
			}
		}
	}

	static class PhyscData {
		String name; // 이름
		int height; // 키
		double vision; // 시력

		// 생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;

	} // 시력분포를 구한다.

	static void disvision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;
		for (int j = 0; j < dat.length; j++) {
			if (dat[j].vision >= 0.0 && dat[j].vision <= VMAX / 10.0) {
				dist[(int) (dat[i].vision * 10)]++;
			}
		}

	}

}
