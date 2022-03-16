package week1;

import java.util.Scanner;

public class dp31_11726 {

	public static void main(String[] args) {
		
		/*
		 * 2xn 타일링
		 * 2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성.
		 * 아래 그림은 2x5 크기의 직사각형을 채운 한 가지 방법의 예이다.
		 * 
		 * - 입력
		 * 첫째 줄에 n이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력.
		 * 
		 * ex)
		 * 2 -> 2
		 * 9 -> 55
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(solution(N));
		
		scan.close();
		
	}
	
	public static int solution(int N) {
		int answer = 0;
		
		int[] dy = new int[N+2];
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i = 3; i <= N; i++) {
			dy[i] = (dy[i-2] + dy[i-1])%10007;
		}
		
		answer = dy[N]%10007;
		
		return answer;
	}
	
}
