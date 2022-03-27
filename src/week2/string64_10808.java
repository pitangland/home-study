package week2;

import java.util.Scanner;

public class string64_10808 {

	public static void main(String[] args) {
		
		/*
		 * 알파벳 개수
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
		 * 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * - 입력
		 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 * 
		 * - 출력
		 * 단어에 포함되어 있는 a의 개수, b의 개수, ..., z의 개수를 공백으로 구분해서 출력한다.
		 * 
		 * ex)
		 * baekjoon -> 11001000011001200000000000
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		int[] alpa = new int[26];
		
		
		// 숫자 0=48, A=65, a=97
		for(char s : S.toCharArray()) {
			int a = s-97;
			alpa[a]++;
		}
		
		for(int i : alpa) {
			System.out.print(i + " ");
		}
		
		
		scan.close();
		
	}
	
}
