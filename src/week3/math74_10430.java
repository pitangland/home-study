package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math74_10430 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 나머지
		 * (A+B)%C 는 ((A%C) + (B%C))%C 와 같을까?
		 * (AxB)%C 는 ((A%C) x (B%C))%C 와 같을까?
		 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 A,B,C가 순서대로 주어진다. (2<=A, B, C <= 10000)
		 * 
		 * - 출력
		 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C
		 * 셋째 줄에 (AxB)%C, 넷째 줄에 ((A%C) x (B%C))%C 를 출력.
		 * 
		 * ex)
		 * 5	->	1
		 * 8		1
		 * 4		0
		 * 			0
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 이거 넣어주니까 numberFormat 런타임에러가 안남.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		sb.append((A+B)%C).append("\n");
		sb.append(((A%C) + (B%C))%C).append("\n");
		sb.append((A*B)%C).append("\n");
		sb.append(((A%C) * (B%C))%C);
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}
