package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp44_2579 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 계단 오르기
		 * 계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임.
		 * 계단을 밟으면 그 계단에 쓰여있는 점수를 얻게 된다.
		 * 1. 계단은 한 번에 한계단씩 또는 두계단씩 오를 수 있다.
		 * 즉, 한 계단을 밝으면서 이어서 다음 계단이나 다음 다음 계단으로 오를 수 있다.
		 * 2. 연속된 세 개의 계단을 모두 밟아서는 안된다. 단, 시작점은 계단에 포함되지 않는다.
		 * 3. 마지막 도착 계단은 반드시 밟아야 한다.
		 * 각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램 작성.
		 * 
		 * - 입력
		 * 입력의 첫째 줄에 계단의 개수가 주어짐.
		 * 둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여있는 점수가 주어짐.
		 * 계단의 개수는 300이하의 자연수, 점수는 10,000 이하의 자연수.
		 * 
		 * - 출력
		 * 첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력.
		 * 
		 * ex)
		 * 6
		 * 10
		 * 20
		 * 15
		 * 25
		 * 10
		 * 20		->		75
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] dy = new int[N+1];
		
		// 두칸뛰어 넘었을 때, 다음에 한칸만 넘어야 함.
		int two = 0;
		// 한칸씩 올라갔을 때, 다음에 두칸 뛰어야 함.
		int one = 0;
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 초기값 설정. 최댓값만을 생각해줘야함.
		dy[1] = arr[1];
		if(N > 1) {
			dy[2] = arr[1] + arr[2];			
		}
		
		for(int i = 3; i <= N; i++) {
			two = arr[i] + dy[i-2];
			one = arr[i] + arr[i-1] + dy[i-3];
			
			dy[i] = Math.max(two, one);
		}
		
		System.out.println(dy[N]);
		
		br.close();
		
	}
	
}
