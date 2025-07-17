package test4.sub5.rensyuu;

public class Main {
	public static void main(String[] args) {
		
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		// 데이터가 자바, 데이터베이스 순으로 들어왔기 때문에 
		// subjects 배열의[0] 인덱스는 자바, [1] 인덱스는 데이터베이스이다. 
		
		
		Student student1 = new Student("김유신", "S001");
		Student student2 = new Student("김춘추", "S002");
		
		student1.enrollSubject(java);
		student1.enrollSubject(database);
		System.out.println("-----------------------------------");
		
		student2.enrollSubject(java);
		student2.enrollSubject(database);
		System.out.println("-----------------------------------");
		
		student1.setScore(java, 96);
		student1.setScore(database, 90);
		System.out.println("-----------------------------------");
		
		student2.setScore(java, 86);
		student2.setScore(database, 76);
		System.out.println("-----------------------------------");
		
		java.printSubjectInfo();
		System.out.println("-----------------------------------");
		
		database.printSubjectInfo();
		System.out.println("-----------------------------------");
	}

}
