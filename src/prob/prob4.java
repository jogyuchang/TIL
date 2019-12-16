package prob;

/*문제1. Prob5내에 leftPad 메쏘드를 작성하십시오. 
       leftPad 메쏘드의 속성은 다음과 같습니다.

1.	메소드 시그니처 : 
        public static String leftPad(String str, int size, char padChar)

2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
        문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
             큰 경우에는 원본 문자열(str)을 그대로 리턴한다.

실행 예) 
leftPad(“SDS”, 6, ‘#’)    ###SDS 
leftPad(“SDS”, 5, ‘$’)    $$SDS
leftPad(“SDS”, 2, ‘&’)    SDS */

public class prob4 {
	public static void main(String args[]) {
		
		prob4 p4 = new prob4();
		
		System.out.println( p4.leftPad("SDS", 6, '#') );
		System.out.println( prob4.leftPad("SDS", 5, '$') ); 
		System.out.println( prob4.leftPad("SDS", 2, '&') ); 
		
		System.out.println(p4.rightPad("SDS", 6, '#'));
	}
	//static method 클래스 메소드
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		StringBuilder sb = new StringBuilder() ;
		int count = size-str.length();
		for(int i = 0; i<count; i++) {
			//str = padChar + str;
			sb.append(padChar);
			
		}
		sb.append(str);
		
		return sb.toString();
		
		
		
	}
	//unstance method new 를 이용
	public static String rightPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		StringBuilder sb = new StringBuilder() ;
		sb.append(str);
		for(int i = 0; i<size-str.length(); i++) {
			//str = padChar + str;
			sb.append(padChar);
			
		}
		return sb.toString();
	}
}  