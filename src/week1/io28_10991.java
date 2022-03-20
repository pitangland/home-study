package week1;

import java.util.Scanner;

public class io28_10991 {

	public static void main(String[] args) {
		
		/*
		 * 별찍기16
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어보세요.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * ex)
	 		  1
		 	  *
			  2
			   *
			  * *
			  3
			     *
			    * *
			   * * *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			System.out.println();
		}
		
		scan.close();
		
	}
	
}
