package week1;

import java.util.Scanner;

public class io27_2446 {

	public static void main(String[] args) {
		
		/*
		 * 별찍기9
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어보세요.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 2xN-1번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex)
		 * 5
			*********
			 *******
			  *****
			   ***
			    *
			   ***
			  *****
			 *******
			*********
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		// 상단
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 2*N-1; j >= 2*i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 하단
		for(int i = 0; i < N; i++) {
			for(int j = N; j > i+1; j--) {
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
