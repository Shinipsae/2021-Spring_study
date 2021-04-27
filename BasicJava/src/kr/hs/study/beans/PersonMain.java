package kr.hs.study.beans;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("kim");
		person.setAge(30);
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
		
		Person person1 = new Person("lee", 25);
		System.out.println("이름: " + person1.getName());
		System.out.println("나이: " + person1.getAge());
		
	}

}
