package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io11_11719 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 그대로 출력하기2
		 * 입력 받은 대로 출력하는 프로그램 작성
		 * 
		 * - 입력
		 * 입력이 주어짐.
		 * 입력은 최대 100줄, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어짐.
		 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고,
		 * 각 줄의 앞뒤에 공백이 있을 수도 있다.
		 * 
		 * - 출력
		 * 입력받은 그대로 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str=br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		
	}
	
}
