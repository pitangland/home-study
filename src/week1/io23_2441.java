package week1;

import java.util.Scanner;

public class io23_2441 {

	public static void main(String[] args) {
		
		/*
		 * 별찍기4
		 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
		 * 하지만, 오른쪽을 기준으로 정렬한 별을 출력하세요.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex)
		 * 5
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int k = N-i; k < N; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= N-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
	
}
