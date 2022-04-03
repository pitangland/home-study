package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math76_1934 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 최소공배수
		 * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
		 * 이런 공배수 중에서 가장 작은 수를 최소공배수. 예를들어, 6과 15의 공배수는 30, 60, 90등이 있으며 최소공배수는 30
		 * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력.
		 * 
		 * ex)
		 * 3			-> 	45000
		 * 1 45000			30
		 * 6 10				221
		 * 13 17
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
				
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int d = gcd(A, B);
			int result = (A*B / d);
			
			sb.append(result).append("\n");
			
		}
		
		System.out.println(sb);
			
		br.close();
		
	}
	
	public static int gcd(int A, int B) {
		if(B == 0) {
			return A;
		}
		// gcd(a, b) = gcd(b, r) -> r=a%b
		return gcd(B, A%B);
	}
	
}
