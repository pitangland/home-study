package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math77_1850 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 최대공약수
		 * 모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 
		 * 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성.
		 * 예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고 A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.
		 * 
		 * - 입력
		 * 첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 2^63보다 작은 자연수이다.
		 * 
		 * - 출력
		 * 첫째 줄에 A와 B의 최대공약수를 출력. 정답은 천만 자리를 넘지 않는다.
		 * 
		 * ex)
		 * 3 4 -> 1
		 * 3 6 -> 111
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// int -> long 에서 바꾸니까 numberFormat 오류는 안나는데 시간초과됨.
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long d = gcd(A, B);
		
		for(int i = 0; i < d; i++) {
			// 이거 사용해주니까 시간초과 해결
			sb.append("1");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
	// 재귀함수
	public static long gcd(long A, long B) {
		if(B == 0) {
			return A;
		}
		// gcd(a, b) = gcd(b, r) -> r=a%b
		return gcd(B, A%B);
	}
	
}
