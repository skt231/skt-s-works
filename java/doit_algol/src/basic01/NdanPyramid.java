package basic01;
//n단의 숫자 피라미드를 출력하는 메서드 작성
//static Void npira(int n) 활용
import java.util.Scanner;

public class NdanPyramid {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    npira(n);
  }
  
  static void npira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++)
        System.out.print(" ");
      for (int j = 0; j < (i - 1) * 2 + 1; j++)
        System.out.print(i);
      System.out.println();
    }
  }
}