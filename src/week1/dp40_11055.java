package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp40_11055 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 가장 큰 증가 부분 수열
		 * 수열 A가 주어졌을 때, 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램 작성.
		 * 예를 들어, 수열 A = {1,100,2,50,60,3,5,6,7,8}인 경우에 
		 * 합이 가장 큰 증가 부분 수열은 A = {1,2,50,60}이고, 합은 113이다.
		 * 
		 * - 입력
		 * 첫째 줄에 수열 A의 크기 N 이 주어짐.
		 * 둘째 줄에는 수열 A를 이루고 있는 A의 원소가 주어짐.
		 * 
		 * - 출력
		 * 첫째 줄에 수열 A의 합이 가장 큰 증가 부분 수열의 합을 출력.
		 * 
		 * ex)
		 * 10
		 * 1 100 2 50 60 3 5 6 7 8 -> 113
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dy = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//초기화
		dy[0] = arr[0];
		
		for(int i = 1; i < N; i++) {
			// 초기화할때 주의해야함.
			dy[i] = arr[i];
			for(int j = i-1; j >= 0; j--) {
				if(arr[i] > arr[j] && dy[i] <= dy[j]+arr[i]) {
					dy[i] = dy[j] + arr[i];
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
	
//	반례에 해당하는 예시
//	4	->	64
//	32 11 22 31
//	8	->	100
//	100 1 2 60 50 3 6 5
//	7	-> 15
//	3 2 1 2 3 4 5
	
}
