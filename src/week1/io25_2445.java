package week1;

import java.util.Scanner;

public class io25_2445 {

	public static void main(String[] args) {
		
		/*
		 * 별찍기8
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 2XN-1번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex)
		 * 5
		 *  *        *
			**      **
			***    ***
			****  ****
			**********	// 여기까지 상단이라함.
			****  ****
			***    ***
			**      **
			*        *
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		// 상단
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = N; k > i+1; k--) {
				System.out.print(" ");
			}
			for(int k = N; k > i+1; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 하단
		for(int i = 0; i < N-1; i++) {
			for(int k = N; k > i+1; k--) {
				System.out.print("*");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = N; k > i+1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
	
}
