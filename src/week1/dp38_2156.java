package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp38_2156 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 포도주 시식
		 * 포도주 시식회에 갔다. 테이블 위에 다양한 포도주가 들어있는 포도주 잔이 일렬로 놓여 있었다.
		 * 포도주 시식을 하려고 하는데, 여기에는 다음과 같은 두 가지 규칙이 있다.
		 * 1. 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
		 * 2. 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
		 * 될 수 있는 대로 많은 양의 포도주를 맛보기 위해 어떤 포도주 잔을 선택해야 할지 고민하고 있다.
		 * 1부터 n까지의 번호가 붙어있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여있고,
		 * 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때, 효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램 작성.
		 * 예를 들어, 6개의 포도주 잔이 있고, 각각의 잔에 순서대로 6,10,13,9,8,1 만큼의 포도주가 들어 있을 때,
		 * 첫번째, 두번째, 네번째, 다섯번째 포도주 잔을 선택하면 총 포도주 양이 33으로 최대로 마실 수 있다.
		 * 
		 * - 입력
		 * 첫째 줄에 포도주 잔의 개수 n이 주어지고,
		 * 둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다.
		 * 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
		 * 
		 * - 출력
		 * 첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
		 * 
		 * ex)
		 * 6
		 * 6
		 * 10
		 * 13
		 * 9
		 * 8
		 * 1 	->		33
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] dy = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 초기화
		dy[1] = arr[1];
		if(N > 1) dy[2] = Math.max(arr[1]+arr[2], arr[2]);
		
		for(int i = 3; i <= N; i++) {
			// 점화식
			//				연속x    ,          연속2잔(앞에 인덱스와 연속2잔), 연속2잔 (뒤에 인덱스와 연속2잔)
			dy[i] = Math.max(dy[i-1], Math.max(dy[i-3]+arr[i-1]+arr[i], dy[i-2]+arr[i]));
		}
		
		System.out.println(dy[N]);
		 
		
		br.close();
		
	}
	
}
