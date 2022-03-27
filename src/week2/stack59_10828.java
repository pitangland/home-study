package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack59_10828 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 스택
		 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성.
		 * 명령은 총 다섯 가지.
		 * push X : 정수 X를 스택에 넣는 연산이다.
		 * pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
		 * 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size : 스택에 들어있는 정수의 개수를 출력한다.
		 * empty : 스택이 비어있으면 1, 아니면 0을 출력한다.
		 * top : 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * 
		 * - 입력
		 * 첫째 줄에 주어지는 명령의 수 N이 주어진다.
		 * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
		 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
		 * 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		 * 
		 * - 출력
		 * 출력해야하는 명령이 주어질때마다, 한 줄에 하나씩 출력한다.
		 * 
		 * ex)
			14							
			push 1 			2
			push 2			2
			top				0
			size			2
			empty			1
			pop				-1
			pop				0
			pop				1
			size 			-1
			empty			0
			pop				3
			push 3
			empty
			top
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// 자바에 있는 스택 쓰는 방법임! 기억해야함!
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			
			// switch에다가 nextToken() 메서드를 넣어주고
			switch(st.nextToken()) {
			case "push":
				// 여기서 st.nextToken() 해주면 숫자가 딱맞게 들어가게 됨.
				// 나머지는 신경쓰지 않아도 됨.
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(!stack.empty()) sb.append(stack.pop()).append("\n");
				else sb.append(-1).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				if(!stack.empty()) sb.append(0).append("\n");
				else sb.append(1).append("\n");
				break;
			case "top":
				// top 맨 위에 있는 것 꺼내는 명령어? 메서드? peek() 이다! 기억하기!
				if(!stack.empty()) sb.append(stack.peek()).append("\n");
				else sb.append(-1).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}
