package basic01;

//네값의 최댓값을 구하는 메서드를 작성하세요
public class Maxfor4integers {
	static int max4(int a, int b, int c, int d) {
		int max = 0;
		if (a < b) { // a<b
			if (c < b) { // c<b
				if (d < b) { // b<d
					max = b;
				} else { // b<d
					max = d;
				}
			} else if (c > b) { // c>b
				if (c < d) {
					max = d;
				} else { // c>d
					max = c;
				}
			}
		} else { // a>b
			if (a > c) { // a>c
				if (a > d) { // a>d
					max = a;
				} else { // a<d
					max = d;
				}
			} else if (a < c) { // a<c
				if (c < d) { // c<d
					max = d;
				} else { // c>d
					max = c;
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max(6,3,2,1) = " + max4(6, 3, 2, 1)); // a>b>c

		System.out.println("max(6,3,1,2) = " + max4(6, 3, 1, 2)); // a>b>c
		System.out.println("max(6,1,3,2) = " + max4(6, 1, 3, 2)); // a>b>c
		System.out.println("max(1,6,3,2) = " + max4(1, 6, 3, 2)); // a>b>c

		System.out.println("max(6,2,3,1) = " + max4(6, 2, 3, 1)); // a>b>c
		System.out.println("max(2,6,3,1) = " + max4(2, 6, 3, 1)); // a>b>c
		System.out.println("max(1,6,3,2) = " + max4(1, 6, 3, 2)); // a>b>c

		System.out.println("max(3,2,1,6) = " + max4(3, 2, 1, 6)); // a>b>c//
		System.out.println("max(2,1,6,3) = " + max4(2, 1, 6, 3)); // a>b>c//
		System.out.println("max(1,6,3,2) = " + max4(1, 6, 3, 2)); // a>b>c

		System.out.println("max(1,6,3,2) = " + max4(1, 6, 3, 2)); // a>b>c
		System.out.println("max(2,1,6,3) = " + max4(2, 1, 6, 3)); // a>b>c//
		System.out.println("max(3,2,1,6) = " + max4(3, 2, 1, 6)); // a>b>c//

	}

}
