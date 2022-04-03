package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math78_9613 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * GCD 합
		 * 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 테스트 케이스의 개수 t 이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다.
		 * 각 테스트케이스는 수의 개수 n가 주어지고, 다음에는 n개의 수가 주어진다.
		 * 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
		 * 
		 * - 출력
		 * 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
		 * 
		 * ex)
		 * 	3					->		70
			4 10 20 30 40				3
			3 7 5 12					35
			3 125 15 25
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			// 이것때문에 틀림
			long answer = 0;
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					answer += gcd(arr[j], arr[k]);
				}
			}
			
			sb.append(answer).append("\n");
			
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
		// 재귀함수
		public static int gcd(int A, int B) {
			if(B == 0) {
				return A;
			}
			// gcd(a, b) = gcd(b, r) -> r=a%b
			return gcd(B, A%B);
		}
	
}
