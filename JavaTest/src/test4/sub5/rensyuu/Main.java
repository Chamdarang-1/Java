package test4.sub5.rensyuu;

public class Main {
	public static void main(String[] args) {
		
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		
		Student student1 = new Student("김유신", "S001");
		Student student2 = new Student("김춘추", "S002");
		
		student1.enrollSubject(java);
		student1.enrollSubject(database);
		System.out.println("-----------------------------------");
		
	}

}
