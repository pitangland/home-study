package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp37_9465 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 스티커
		 * 문방구에서 스티커 2n개를 구매했다. 스티커는 2행 n열로 배치되어 있고, 책상을 꾸미려 한다.
		 * 구매한 스티커의 품질은 매우 좋지 않아, 스티커 한장을 떼면 그 스티커와 변을 공유하는 스티커는 모두 찢어져서 사용할 수 없게된다.
		 * 즉, 뗀 스티커의 왼쪽, 오른쪽, 위, 아래에 있는 스티커는 사용할 수 없게 된다.
		 * 모든 스티커를 붙일 수 없게된 상냥이는 각 스티커에 점수를 매기고, 점수의 합이 최대가 되게 스티커를 떼어내려고 한다.
		 * 상냥이가 뗄 수 있는 스티커의 점수의 최댓값을 구하는 프로그램 작성.
		 * 즉, 2n개의 스티커 중에서 점수의 합이 최대가 되면서 서로 변을 공유하지 않는 스티커 집합을 구해야 함.
		 * 
		 * - 입력
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스의 첫째 줄에는 N이 주어지고, 다음 두 줄에는 N개의 정수가 주어지며,
		 * 각 정수는 그 위치에 해당하는 스티커의 점수이다.
		 * 연속하는 두 정수 사이에는 빈 칸이 하나 있다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * - 출력
		 * 각 테스트 케이스마다, 2n개의 스티커 중에서 두 변을 공유하지 않는 스티커 점수의 최댓값을 출력.
		 * 
		 * ex)
		 * 2
		 * 5
		 * 50 10 100 20 40
		 * 30 50 70 10 60
		 * 7
		 * 10 30 10 50 100 20 40						260
		 * 20 40 30 50 60 20 80				-> 			290
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		
		// for문을 많이 쓸때, 인덱스 변수 잘 보기
		for(int i = 0; i < T; i++) {
	
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[][] arr = new int[2][N+1];
			int[][] dy = new int[2][N+1];
			
			for(int j = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine());
//				String[] line = br.readLine().split(" ");
				for(int k = 1; k <= N; k++) {
//					System.out.println(Integer.parseInt(st.nextToken()));
						arr[j][k] = Integer.parseInt(st.nextToken());						
				}
			}
			
			// 초기화
			dy[0][1] = arr[0][1];
			dy[1][1] = arr[1][1];
			
			for(int l = 2; l <= N; l++) {
				dy[0][l] = Math.max(dy[1][l-1], dy[1][l-2]) + arr[0][l];
				dy[1][l] = Math.max(dy[0][l-1], dy[0][l-2]) + arr[1][l];
			}
			System.out.println(Math.max(dy[0][N], dy[1][N]));
		}
		
		
		
		br.close();
		
	}
	
}
