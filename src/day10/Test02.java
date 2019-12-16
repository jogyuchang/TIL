package day10;

public class Test02 {

	public static void main(String[] args) {
//		Employee2<String,String> emp1 = 
//				new Employee2<String,String>("홍길동","2019001");
//		System.out.println(emp1);
		
		Employee2<String,Integer> emp2 = 
				new Employee2<String,Integer>("홍길동",2019001);
		System.out.println(emp2.number/1000);
		
		Employee2<String,Double> emp3 = 
				new Employee2<String,Double>("홍길동",2019001.0);
		System.out.println(emp3);
		
		Employee2 emp4 = new Employee2("고길동",201701);
		System.out.println(emp4);
		System.out.println(emp4.number.getClass());

	}

}
//extends Number 경우 타입에 Number의 자식으로 제약 가능   (String 에러뜸)
class Employee2<T, P extends Number>{
	//T,P자리에  Object 사용시 Downcasting 필요
	T name;
	P number;
	
	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}
	
}
