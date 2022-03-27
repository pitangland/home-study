package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class string69_10824 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 네 수
		 * 네 자연수 A, B, C, D가 주어진다.
		 * 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성.
		 * 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다.
		 * 즉, 20과 30을 붙이면 2030이 된다.
		 * 
		 * - 입력
		 * 첫 째 줄에 네 자연수 A, B, C, D가 주어진다. (1 <= A, B, C, D <= 1,000,000)
		 * 
		 * - 출력
		 * A와 B를 붙인 수와 C와 D를 붙인 수의 합을 출력.
		 * 
		 * ex)
		 * 10 20 30 40 -> 4060
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		String c = st.nextToken();
		String d = st.nextToken();
		
		String ab = a+b;
		String cd = c+d;
		
		long result = (Long.parseLong(ab)) + (Long.parseLong(cd));
		
		System.out.println(result);
		
		br.close();
		
	}
	
}
