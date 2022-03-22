package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting51_2751 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 수 정렬하기 2
		 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 * 
		 * - 입력
		 * 첫째 줄에 수의 개수 N이 주어진다.
		 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 
		 * 이 수는 절댓값이 1,000,000 보다 작거나 같은 정수이다.
		 * 수는 중복되지 않는다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 * 
		 * ex)
		 * 5	->
		 * 5		1
		 * 4		2
		 * 3		3
		 * 2		4
		 * 1		5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시간초과때문에 이걸로 출력해줌.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
//		sb.append(list);
		for(int i = 0; i < N; i++) {
			sb.append(list.get(i) + "\n");
		}
		
		bw.write(String.valueOf(sb) + "\n");
		
		bw.flush();
		bw.close();
		
		br.close();
		
	}
	
}
