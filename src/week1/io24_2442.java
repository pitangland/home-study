package week1;

import java.util.Scanner;

public class io24_2442 {

	public static void main(String[] args) {
		
		/*
		 * 별찍기5
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ... N번째 줄에는 별 2xN-1개를 찍는 문제
		 * 별은 가운데를 기준으로 대칭이어야 한다.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex)
		 * 5
		 *     *   
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int k = N; k > i+1; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
	
}
