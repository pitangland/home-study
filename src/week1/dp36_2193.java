package week1;

import java.util.Scanner;

public class dp36_2193 {

	public static void main(String[] args) {
		
		/*
		 * 이친수
		 * 0과 1로만 이루어진 수를 이진수라 한다.
		 * 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데, 이들을 이친수라 함.
		 * 1. 이친수는 0으로 시작하지 않는다.
		 * 2. 이친수에서는 1이 두번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
		 * 예를 들면 1, 10, 100, 101, 1000, 1001 등이 이친수가 된다. 하지만 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아님.
		 * N이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 N이 주어짐.
		 * 
		 * - 출력 
		 * 첫째 줄에 N자리 이친수의 개수를 출력.
		 * 
		 * ex)
		 * 3 -> 2
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		// 변수 타입때문에 틀릴 수도 있으니까 조심!
		long[] dy = new long[N+1];
		dy[1] = 1;
		
		// 이부분에서 런타임에러가 났었음(ArrayIndexOutOfBounds)
		if(N > 1) dy[2] = 1;
		
		for(int i = 3; i <= N; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		
		System.out.println(dy[N]);
		
		scan.close();
		
	}
	
}

