package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class io17_1924 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 2007년
		 * 오늘은 2007년 1월 1일 월요일.
		 * 그렇다면 2007년 x월 y일은 무슨 요일일까? 
		 * 이를 알아내는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 빈 칸을 사이에 두고 x와 y이 주어진다.
		 * 참고로 2007년에는 1,3,5,7,8,10,12월은 31일까지,
		 * 4,6,9,11월은 30일까지, 2월은 28일까지 있다.
		 * 
		 * - 출력
		 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN,MON,TUE,WED,THU,FRI,SAT 중 하나 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int count = 0;
		
		for(int i = 0; i < x; i++) {
			
			count += month[i];
		}
		
		count += y;
		
		System.out.println(day[count%7]);
		
		br.close();
		
	}
	
}
