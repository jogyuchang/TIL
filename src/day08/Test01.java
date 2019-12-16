package day08;

import day07.Animal;

public class Test01 {

	public static void main(String[] args) {
		Animal a = new Animal() ;
		//System.out.println(a.kind); // public은 가능 
		//default값은 접근 관련 modifier를 지정하지 않은 경우이다.
		//이는 동일 패키지에 속하는 클래스만 접근할 수 있는 멤버이다.


	}

}

class Dog2 extends Animal{
	public void print() {
		System.out.println(super.kind);
		//protected 동일 패키지와 동일 패키지에 포함되지는 않지만
		//하위 클래스 관계에 있는 클래스도 접근할 수 있다.


		
	}
}