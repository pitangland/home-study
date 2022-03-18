package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp50_11052 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 카드 구매하기
		 * 요즘 민규네 동네에서는 스타트링크에서 만든 PS카드를 모으는 것이 유행이다.
		 * PS는 PS 분야에서 유명한 사람들의 아이디와 얼굴이 적혀있는 카드이다. 
		 * 각각의 카드에는 등급을 나타내는 색이 칠해져 있고, 다음과 같이 8가지가 있다.
		 * 전설,레드,오렌지,퍼플,블루,청록,그린,그레이 
		 * 카드는 카드팩의 형태로만 구매할 수 있고, 카드팩의 종류는 카드 1개가 포함된 카드팩, 2개가 포함된 카드팩,,, N개가 포함된 카드팩 총 N개
		 * 카드의 개수가 적은 팩이더라도 가격이 비싸면 높은 등급의 카드가 많이 들어있을 것이라는 미신을 믿고 있다. 
		 * 따라서, 민규는 돈을 최대한 많이 지불해서 카드 N개 구매하려고 한다. 카드가 i개 포함된 카드팩의 가격은 Pi원이다.
		 * 
		 * - 입력
		 * 첫째 줄에 민규가 구매하려고 하는 카드의 개수 N이 주어짐. (1 <= N <= 1000)
		 * 둘째 줄에는 Pi가 P1부터 Pn까지 순서대로 주어진다. (1 <= Pi <= 10000)
		 * 
		 * - 출력
		 * 첫째 줄에 민규가 카드 N개를 갖기 위해 지불해야 하는 금액의 최댓값을 출력.
		 * 
		 * ex)
		 * 4
		 * 1 5 6 7 	-> 10
		 * 5
		 * 10 9 8 7 6	-> 50
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] dy = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				dy[i] = Math.max(dy[i], dy[i-j] + arr[j]);
			}
		}
		
		int max = 0;
		for(int i = 1; i <= N; i++) {
			if(max < dy[i]) max = dy[i];
		}
		
		System.out.println(max);
		
		br.close();
		
	}
	
}
