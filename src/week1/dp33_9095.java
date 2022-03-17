package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp33_9095 {

	public static void main(String[] args) throws IOException {

		/*
		 * 1, 2, 3 더하기 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지이다. 합을 나타낼 때는 수를 1개 이상 사용해야한다.
		 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성.
		 * 
		 * - 입력 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어짐. 각 테스트 케이스는 한 줄, 정수 n 이 주어짐. n은 양수, 11보다 작음.
		 * 
		 * - 출력 
		 * 각 테스트 케이스마다 n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
		 * 
		 * ex) 
		 * 3 	-> 
		 * 4 		7 
		 * 7 		44 
		 * 10 		274
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 문제에 n은 11보다 작다고 나와있으므로. 크기를 11로 초기화.
		int[] dy = new int[11];
		dy[1] = 1;
		dy[2] = 2;
		dy[3] = 4;


		for (int j = 4; j <= 10; j++) {
			dy[j] = dy[j - 3] + dy[j - 2] + dy[j - 1];
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(dy[arr[i]]);
		}

		br.close();

	}

}
