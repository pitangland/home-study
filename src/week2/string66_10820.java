package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string66_10820 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 문자열 분석
		 * 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램 작성.
		 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
		 * 
		 * - 입력
		 * 첫째 줄부터 N번째 줄까지 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력.
		 * 
		 * ex)
		 * This is String 	->		10 2 0 2
		 * SPACE    1    SPACE  	0 10 1 8
		 *  S a M p L e I n P u T	5 6 0 16
		 * 0L1A2S3T4L5I6N7E8		0 8 9 0
		 */
		
		// 숫자 0=48, A=65, a=97
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			int[] result = new int[4];
			
			for(char s : input.toCharArray()) {
				if(s >= 97) {
					result[0]++;
				} else if (s >= 65) {
					result[1]++;
				} else if (s >= 48) {
					result[2]++;
				} else {
					result[3]++;
				}
			}
			
			for(int i : result) {
				System.out.print(i + " ");
			}
			System.out.println();
		
		}
		
		br.close();
		
	}
	
}
