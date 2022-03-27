package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sorting52_11650 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 좌표 정렬하기
		 * 2차원 평면 위의 점 N개가 주어진다. 
		 * 좌표를 x좌표가 증가하는 순으로, 
		 * x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음
		 * 출력하는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 점의 개수 N이 주어진다. 
		 * 둘째 줄부터 N개의 줄에는 i번점의 위치 x와 y가 주어진다.
		 * 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
		 * 
		 * ex)
		 * 5 		->
		 * 3 4				1 -1
		 * 1 1				1 1
		 * 1 -1				2 2	
		 * 2 2				3 3
		 * 3 3				3 4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		// 람다식을 이용하면 쉽다는데 .. ? 어렵다.. ! 
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
		}
		
		
		
		bw.flush();
		bw.close();
		
		br.close();
		
	}
	
}
