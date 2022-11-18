package basic01;
//n단의 피라디느 출려가는 메서드 작성하라
//static void spira(int n) 활용
import java.util.Scanner;

public class Method_AngledTriangle_1 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    spira(n);
  }
  
  static void spira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++)
        System.out.print(" ");
      for (int j = 0; j < (i - 1) * 2 + 1; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}