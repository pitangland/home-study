package week1;

import java.util.Scanner;

public class dp43_1912 {

	public static void main(String[] args) {
		
		/*
		 * 연속합
		 * n개의 정수로 이루어진 임의의 수열이 주어짐.
		 * 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다.
		 * 단, 수는 한 개 이상 선택해야 한다.
		 * 예를 들어, 10,-4,3,1,5,6,-35,12,21,-1 이라는 수열이 주어졌다고 하자.
		 * 여기서 정답은 12+21 = 33이다.
		 * 
		 * - 입력
		 * 첫째 줄에 정수 n이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
		 * 수는 -1000보다 크거나 같고, 1000보다 작거나 같은 정수이다.
		 * 
		 * - 출력
		 * 첫째 줄에 답을 출력한다.
		 * 
		 * ex)
		 * 10
		 * 10 -4 3 1 5 6 -35 12 21 -1 	->		33
		 * 10
		 * 2 1 -4 3 4 -4 6 5 -5 1		->		14
		 * 5
		 * -1 -2 -3 -4 -5				->  	-1
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int[] dy = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		dy[0] = arr[0];
		int max = arr[0];
		
		for(int i = 1; i < N; i++) {
			dy[i] = Math.max(dy[i-1]+arr[i], arr[i]);
			
			max = Math.max(max, dy[i]);
		}
		
		System.out.println(max);
		
		scan.close();
		
	}
	
}
