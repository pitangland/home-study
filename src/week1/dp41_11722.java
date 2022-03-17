package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp41_11722 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 가장 긴 감소하는 부분 수열
		 * 수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램 작성.
		 * 예를 들어, 수열 A = {10,30,10,20,20,10} 인 경우에 
		 * 가장 긴 감소하는 부분 수열은 A={30,20,10} 이고, 길이는 3이다.
		 * 
		 * - 입력
		 * 첫째 줄에 수열 A의 크기 N이 주어진다.
		 * 둘째 줄에는 수열 A를 이루고 있는 A의 원소가 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열이 길이를 출력.
		 * 
		 * ex)
		 * 6
		 * 10 30 10 20 20 10	-> 		3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dy = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 초기값
		dy[0] = 1;
		
		for(int i = 1; i < N; i++) {
			dy[i] = 1;
			for(int j = i-1; j >= 0; j--) {
				if(arr[i] < arr[j] && dy[j] >= dy[i]) {
					dy[i] = dy[j] + 1;
				}
			}
//			System.out.println(dy[i]);
		}
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(max < dy[i]) max = dy[i];
		}
		
		System.out.println(max);
		
		br.close();
		
	}
	
}
