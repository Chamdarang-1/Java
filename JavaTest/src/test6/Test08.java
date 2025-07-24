package test6;

class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}

class Student extends Person{
	protected String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("학교 : " + this.school);
	}
}

class SalaryStudent extends Person{
	private String job;

	public SalaryStudent(String name, int age, String school, String job) {
		super(name, age, school);
		this.job = job;
	}
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("학교 : " + this.school);
		System.out.println("직업 : " + this.job);
	}
	
	
}
public class Test08 {
	
	

}
