package week2;

import java.util.Scanner;

public class string70_11656 {

	public static void main(String[] args) {
		
		/*
		 * 접미사 배열
		 * 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
		 * baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지.
		 * 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
		 * 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.
		 * 
		 * - 출력
		 * 첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
		 * 
		 * ex)
		 * baekjoon -> ackjoon
		 * 			   baekjoon
		 * 			   ekjoon
		 * 			   joon
		 * 			   kjoon
		 * 			   n
		 * 			   on
		 * 		  	   oon
		 */
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = scan.next();
		
		
		
		scan.close();
		
	}
	
}
