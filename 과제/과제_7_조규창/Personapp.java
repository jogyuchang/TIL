package prob;

public class Personapp {
	public static void main(String[] args) {
  		Person[] persons= {
			new Student("홍길동",20,200201),
			new Teacher("이순신",30,"JAVA"),
			new Employee("유관순",40,"교무과")
	};
	
	
	for(Person person : persons) {
		if(person instanceof Student)
			((Student)person).print();
		if(person instanceof Teacher)
			((Teacher)person).print();
		if(person instanceof Employee)
			((Employee)person).print();
				
}
}
}