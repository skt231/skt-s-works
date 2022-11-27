package two;

public class ssss{

		public static void main(String[] args) {			
	for (int i = 0; i <= 32; i++) {
				for (int j = 0; j <= 27; j++) {
					// if 3의 배수 판별법 ex)3,6,9,12..
					if ((i + j) % 3 == 0 && (i + j) != 0) {
						System.out.println("가로 " + i + "cm 더하기 세로 " + j + "cm는 3의 배수입니다");
				}
			}
}
	}
}
