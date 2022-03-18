package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp47_9461 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 파도반 수열
		 * 오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다.
		 * 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 
		 * 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다.
		 * 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.
		 * 파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1) ~ P(10) 1, 1, 1, 2, 2, 3, 4, 5, 7, 9 이다.
		 * N이 주어졌을 때, P(N)을 구하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어짐.
		 * 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어짐. (1 <= N <= 100)
		 * 
		 * - 출력
		 * 각 테스트 케이스마다 P(N)을 출력
		 * 
		 * ex)
		 * 2	->	
		 * 6		3
		 * 12		16
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		// long으로 선언해주니까 맞았다고 뜬다..
		long[] dy = new long[101];
	
		// 초기값 설정
		dy[1] = 1;
		dy[2] = 1;
		
		// 테스트 케이스를 돌리는 for문
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 3; j <= N; j++) {
				dy[j] = dy[j-3] + dy[j-2];
			}
			
			System.out.println(dy[N]);
		}
		
		br.close();
		
	}
	
}
