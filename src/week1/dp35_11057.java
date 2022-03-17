package week1;

import java.util.Scanner;

public class dp35_11057 {

	public static void main(String[] args) {
		
		/*
		 * 오르막 수
		 * 오르막 수는 수의 자리가 오름차순을 이루는 수를 말함. 이때, 인접한 수가 같아도 오름차순으로 친다.
		 * 예를 들어, 2234와 3678, 11119는 오르막 수이지만,2232, 3676, 91111은 오르막 수가 아니다.
		 * 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램 작성. 수는 0으로 시작할 수 있다.
		 * 
		 *  - 입력
		 *  첫째 줄에 N이 주어짐.
		 *  
		 *  - 출력
		 *  첫째 줄에 길이가 N인 오르막 수의 개수를 10007로 나눈 나머지를 출력.
		 *  
		 *  ex)
		 *  1 -> 10
		 *  2 -> 55
		 *  3 -> 220
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		// int[길이][시작하는 숫자]
		int[][] dy = new int[N+1][10];
		
		// 초기값 설정.
		for(int i = 0; i < 10; i++) {
			dy[1][i] = 1;
		}
		
		for(int i = 2; i <= N; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				for(int k = 0; k <= j; k++) {
					dy[i][j] += dy[i-1][k];
				}
				dy[i][j] %= 10007;
			}
				
		}
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += dy[N][i];
		}
		
		System.out.println(sum%10007);
		
		scan.close();
		
	}
	
}
