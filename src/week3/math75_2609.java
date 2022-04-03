package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math75_2609 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 최대공약수와 최소공배수
		 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력.
		 * 
		 * ex)
		 * 24 18 -> 6
		 * 			72
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		// 최대공약수
		int d = gcd(A, B);
		System.out.println(d);
		System.out.println(A*B / d);
		
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
