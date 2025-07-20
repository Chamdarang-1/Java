package test4_1;

public class Test1 {
	public static void main(String[] args) {
		// 학생 성적 객체 생성
		StudentScore student = new StudentScore("홍길동","S001","자바",90.0);
		
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("--------------------");
		
		student.updateScore(98.0);
		System.out.println("--------------------");
		
		student.updateScore(102.0);
		System.out.println("--------------------");
		
		student.printStudentInfo();        
		System.out.println("--------------------");
		
	}

}
