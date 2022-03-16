package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;

public class io13_11721 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 열 개씩 끊어 출력하기
		 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어짐.
		 * 한 줄에 10글자씩 끊어서 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 단어가 주어짐.
		 * 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않음.
		 * 길이가 0인 단어는 주어지지 않는다.
		 * 
		 * - 출력
		 * 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력
		 * 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int s = 0;
		int e = 10;
		
		for(int i = 0; i < str.length()/10; i++) {
			System.out.println(str.substring(s,e));
			s+=10;
			e+=10;
		}
		
		System.out.println(str.substring(10*(str.length()/10)));
		
		br.close();
		
	}
	
}
