package week1;

import java.util.Scanner;

public class dp34_10844 {

	public static void main(String[] args) {
		
		/*
		 * 쉬운 계단 수
		 * 45656이란 수를 보자.
		 * 이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.
		 * N이 주어질 때, 길이가 N인 계단 수가 총 몇개 있는지 구해보자.
		 * 0으로 시작하는 수는 계단수가 아니다.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수.
		 * 
		 * - 출력
		 * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력.
		 * 
		 * ex)
		 * 1 -> 9
		 * 2 -> 17
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long answer = 0;
		long MOD = 1_000_000_000L;
		
		//long[길이][시작하는 계단수]
		long[][] dy = new long[N+1][10];
		
		dy[1][0] = 0L;
		
		for(int i = 1; i < 10; i++) {
			dy[1][i] = 1L;
		}
		
		for(int i = 2; i <= N; i++) {
			
			// 0으로 시작하는 계단 수는 i-1 길이이고, 1로 시작하는 계단수의 개수와 동일.
			dy[i][0] = dy[i-1][1];
			
			for(int j = 1; j < 10; j++) {
				
				if(j == 9) {
					dy[i][9] = dy[i-1][8] % MOD;
				} else {
					dy[i][j] = (dy[i-1][j-1] % MOD + dy[i-1][j+1] % MOD) % MOD;				
				}
				
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			answer = (answer + dy[N][i]) % MOD;
		}
		
		System.out.println(answer);
		
		scan.close();
		
	}
	
}
