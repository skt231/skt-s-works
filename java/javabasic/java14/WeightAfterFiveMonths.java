package d19;

import java.util.Scanner;

public class WeightAfterFiveMonths {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double start = input.nextInt();
		input.nextLine();
		int after = input.nextInt();
		input.nextLine();

		double result = weight(start, after);

		System.out.printf("%d개월 후 예상 몸무게 => %fkg", after, result);
		
	}

	public static double weight(double curWeight, int months) {
		double expcweight= curWeight;
		for(int i = 0; i<months; i++) {
			expcweight+=0.231;
		}
		
		return months;
		
	}
}