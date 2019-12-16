package day05;

public class Calc {
    //메소드 오버로딩  : 메소드의 이름이 같더라도 전달받는 매개변수 자료형이 다르면
   // 중복된 메소드명을 사용할 수 있다

	public static int add(int ... a) { //가변인자 위치 항상 마지막 
		int sum= 0;
		for(int i=0;i<a.length ;i++) {
			sum += a[i];
		}
		return sum;
}
	public static double add(double a,double b){
		return a+b;
	}
	public static int add(int a,int b){
		return a+b;
	}
}
