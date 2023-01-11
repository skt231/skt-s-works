package com.human.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		star(3);
//samgu();
//		scores();
//		arrayDouble();
//		DimensionArrayEx1();
//		DimensionArrayEx2();
	}

	

	public static void star(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void samgu() {
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
			System.out.print(",");
			if (i % 3 == 0) {
				System.out.print("짝");
				System.out.print(",");
			}
		}

	}

	public static void scores() {
		int score[] = { 40, 80, 76, 34, 88, 100, 98, 90, 82, 72 };
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int avg = sum / score.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}

	public static void arrayDouble() {
		int[][] scores = { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println("int: " + scores[i]);
			}
		}
	}

	public static void DimensionArrayEx1() {
		System.out.println("1-1");
		int[][] scores = { { 40, 80, 76, 34, 88, 100, 98, 90, 82, 72 },
				{ 74, 54, 94, 32, 56, 98, 100, 78, 58, 88, 92, 86 } };
		int clas = 1;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(clas++ + "반 : ");
			for (int j = scores[i].length - 1; j >= 0; j--) {
				System.out.print((scores[i][j]));
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------------------");
		System.out.println("1-2");
		int max = 0, min = 100;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > max) {
					max = scores[i][j];
				} else if (scores[i][j] > min) {
					min = scores[i][j];
				}
			}
		}
		System.out.print("최고점 : " + max);
		System.out.println(" 최저점 : " + min);
		System.out.println("------------------------------------------");
		System.out.println("1-3");
		int sum = 0;	int avg = 0;	int clas1 = 0;	int count = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				++count;
			}
			avg = sum / count;
			System.out.println(++clas1 + " 반 총합 : " + sum + " 평균 : " + avg);
			sum = 0; count = 0;
			
		}
		System.out.println("------------------------------------------");
	
	}
		public static void DimensionArrayEx2() {
			System.out.println("------------------------------------------");
			System.out.println("2-1");
			int [][]arr=new int[3][4];
			Random random=new Random();
			//배열 저장
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=random.nextInt(10);					
				}
			}
		//배열 출력
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println(" ");
		}
			System.out.println("------------------------------------------");
			System.out.println("2-2");
			int colummsum=0; int columm=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					colummsum += arr[i][j];
				}
				
				System.out.println(columm+"열 총 합 : " + colummsum);
				colummsum=0;
				columm++;
		}
			System.out.println("------------------------------------------");
			System.out.println("2-3");
			int randomsum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					randomsum += arr[i][j];
				}
			
		}
			System.out.println("배열 총합 : " + randomsum);
	}

}


