package week1;

import java.util.Scanner;

public class io22_2440 {

	public static void main(String[] args) {

		/*
		 * 별찍기3 
		 * 첫째 줄에는 별 N개, 둘째줄에는 별 N-1개, ... , N번째 줄에는 별 1개를 찍는 문제
		 * 
		 * - 입력 
		 * 첫째 줄에 N이 주어진다. (1<=N<=100)
		 * 
		 * - 출력 
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex) 
		 * 5 
		 * ***** 
		 * **** 
		 * *** 
		 * ** 
		 * *
		 */

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();

	}

}
