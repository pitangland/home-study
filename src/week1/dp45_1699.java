package week1;

import java.util.Scanner;

public class dp45_1699 {

	public static void main(String[] args) {
		
		/*
		 * 제곱수의 합
		 * 어떤 자연수 N은 그보다 작거나 같은 제곱수들의 합으로 나타낼 수 있다.
		 * 11 = 3^2+1^2+1^2 (3개항)이다. 또는 11=2+2+1+1+1 (5개항)
		 * 주어진 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수를 구하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 자연수 N이 주어진다. (1 <= N <= 100000)
		 * 
		 * - 출력
		 * 주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력.
		 * 
		 * ex)
		 * 7	->		4
		 * 1	->		1
		 * 4	->		1
		 * 11	->		3
		 * 13	->		2
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] dy = new int[1000001];
		
		dy[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			for(int j = 1; j*j <= i; j++) {
				if(dy[i] > dy[i-j*j] + 1 || dy[i] == 0) {
					dy[i] = dy[i-j*j] + 1;
				}
			}
		}
		System.out.println(dy[N]);
		
		scan.close();
		
	}
	
}






