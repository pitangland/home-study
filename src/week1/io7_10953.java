package week1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class io7_10953 {

	public static void main(String[] args) {

		/*
		 * A+B-6 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 작성.
		 * 
		 * - 입력 첫째 줄에 테스트 케이스의 개수 T가 주어짐. 각 테스트케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어짐. A와 B는
		 * 콤마로 구분되어 있음.
		 * 
		 * - 출력 각 테스트 케이스마다 A+B를 출력
		 */

		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(scan.next(), ",");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
		}
		
		scan.close();

	}

}
