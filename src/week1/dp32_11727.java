package week1;

import java.util.Scanner;

public class dp32_11727 {

	public static void main(String[] args) {
		
		/*
		 * 2xn 타일링 2
		 * 2xn 직사각형을 1x2, 2x1과 2x2 타일로 채우는 방법의 수를 구하는 프로그램 작성.
		 * 아래 그림은 2x17 직사각형을 채운 한가지 예.
		 * 
		 * - 입력
		 * 첫째 줄에 n이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10007로 나눈 나머지를 출력.
		 * 
		 * ex)
		 * 2 -> 3
		 * 8 -> 171
		 * 12 -> 2731
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] dy = new int[N+2];
		
		dy[1] = 1;
		dy[2] = 3;
		
		for(int i = 3; i <= N; i++) {
			dy[i] = (dy[i-1] + 2*dy[i-2])%10007;
		}
		
		System.out.println(dy[N]%10007);
		
		scan.close();
		
	}
	
}
