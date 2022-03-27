package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack60_9012 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 괄호
		 * 괄호 문자열은 두 개의 괄호 기호인 '(' 와 ')' 만으로 구성되어 있는 문자열이다.
		 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열이라고 부른다.
		 * 한 쌍의 괄호 기호로 된 '(' ')' 문자열은 기본 VPS 이라고 부른다.
		 * 만일 x가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 "(x)"도 VPS가 된다.
		 * 주어진 괄호 문자열이 VPS인지 아닌지를 판단해 그 결과를 YES와 NO로 나타내어야 한다.
		 * 
		 * - 입력
		 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다.
		 * 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
		 * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다.
		 * 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
		 * 
		 * - 출력
		 * 출력은 표준 출력을 사용한다.
		 * 만일 입력 괄호 문자열이 올바른 괄호 문자열이면 "YES", 아니면 "NO"를 한 줄에 하나씩 차례대로 출력해야 한다.
		 * 
		 * ex)
		 *	6	
			(())())						NO
			(((()())()					NO
			(()())((()))				YES
			((()()(()))(((())))()		NO
			()()()()(()()())()			YES
			(()((())()(					NO
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ss:for(int i = 0; i < N; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(char s : str.toCharArray()) {
				if(s == '(') {
					stack.push(s);
				} else if(stack.empty()) {
					sb.append("NO").append("\n");
					continue ss;
				} else {
					stack.pop();
				}
			}
			if(stack.empty()) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
			
		}
		
		System.out.println(sb);
		
		br.close();
		
	}
	
}
