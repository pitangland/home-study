package week1;

import java.util.Scanner;

public class dp46_2133 {

	public static void main(String[] args) {
		
		/*
		 * 타일 채우기
		 * 3xN 크기의 벽을 2x1, 1x2 크기의 타일로 채우는 경우의 수를 구해보자.
		 * 
		 * - 입력
		 * 첫째 줄에 N(1<=N<=30)이 주어짐.
		 * 
		 * - 출력
		 * 첫째 줄에 경우의 수를 출력한다.
		 * 
		 * ex)
		 * 2 -> 3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] dy = new int[31];
		
		// 초기값 설정
		dy[0] = 1;
		dy[1] = 0;
		
		if(N > 1) dy[2] = 3;
		
		// 2씩 증가하는 이유는 홀수에는 만들어지지 않음. 즉, 0이다.
		for(int i = 4; i <= N; i+=2) {
			dy[i] = 3*dy[i-2];
			for(int j = 0; j < i-2; j+=2) {
				dy[i] = dy[i] + dy[j]*2; 
			}
		}
		
		System.out.println(dy[N]);
		
		scan.close();
		
	}
	
}
