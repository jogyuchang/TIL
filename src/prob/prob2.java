package prob;

import java.util.Scanner;
public class prob2 {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		for (int i = 0; i < sourceString.length(); i++) {
			char temp = ' ';
			temp = sourceString.charAt(i);
			if (temp >= 'a' && temp < 'x') {
				temp = (char) (temp + 3);
			} else if (temp >= 'x' && temp <= 'z') {
				temp = (char) (temp -23);
			} 
			encodedString += temp;
		}
		
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}