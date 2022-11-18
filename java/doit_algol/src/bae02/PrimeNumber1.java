package bae02;

//1000이하의 소수를 열거(버전1)
public class PrimeNumber1 {
//소수는 2부터 n-1까지 어떠한 정수로 나누어도 나누어 떨어지지 않는수
	public static void main(String[] args) {
		int counter = 0; // 카운터 용도

		for (int n = 2; n < 1000; n++) { // 소수의 개수 세기 :n-1까지
			int i;
			for (i = 2; i <= n; n++) { // n과 n-1까지 나눈값이 0이 아니라면
				counter++; // counter
				if (n % i == 0) {
					break;
				}
			}
			System.out.println(counter);
		}
	}

}
