package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp39_11053 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 가장 긴 증가하는 부분 수열
		 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성.
		 * 예를 들어, 수열 A = {10,20,10,30,20,50}인 경우에
		 * 가장 긴 증가하는 부분 수열은 A = {10,20,30,50} 이고, 길이는 4이다.
		 * 
		 * - 입력
		 * 첫째 줄에 수열 A의 크기 N이 주어짐.
		 * 둘째 줄에는 수열 A를 이루고 있는 A의 원소가 주어진다.
		 * 
		 * - 출력
		 * 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력.
		 * 
		 * ex)
		 * 6
		 * 10 20 10 30 20 50		->		4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dy = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			// 모든 수 초기화를 1로 초기화.
			dy[i] = 1;
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < i; j++) {
				// j보다 i가 더 큰데? 값은 작은 것을 골라내어 +1 을 해주는 조건문.
				if(arr[i] > arr[j] && dy[j] >= dy[i]) {
					dy[i] = dy[j]+1;
				}
			}
		}
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(max < dy[i]) max = dy[i];
		}
		
		System.out.println(max);
		
		br.close();
		
	}
	
}
