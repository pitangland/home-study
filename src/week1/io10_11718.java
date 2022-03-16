package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io10_11718 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 그대로 출력하기
		 * 입력 받은 대로 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 입력이 주어짐. 
		 * 입력은 최대 100줄, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있음.
		 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않음.
		 * 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 * 
		 * - 출력
		 * 입력받은 그대로 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		while ((str=br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		
	}
	
}
