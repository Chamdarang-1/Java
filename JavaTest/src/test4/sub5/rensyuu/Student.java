package test4.sub5.rensyuu;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects; 
	private int[] scores;
	private int subjectCount;
	
public Student (String name, String studentId) {
	this.name = name;
	this.studentId = studentId;
	this.subjects = new Subject[10];
	this.scores = new int[10]; 
	// 나의 답 this.scores = new scores[10];
	// 배열 생성시 항상 new 뒤에는 자료형이 나와야함. 따라서 scores가 아닌 int가 나와야함. 
	this.subjectCount = 0;
	
}

public void enrollSubject(Subject subject) { 
	// 내 답 : public void enrollSubject() {
	// 메서드 뒤 괄호는 매개변수를 받는 곳인데, 어떤 과목을 신청할 건지 받아야 하니까, 
	// Subject subject(Main class에서 선언한 변수) 
	this.subjects[this.subjectCount] = subject;
	this.subjectCount++;
	// 수강 신청을 한 것을 표현하는 로직을 짜야 한다.
	// 쉽게 생각해보면 수강신청을 한다는 것은, 현재 값이 0(False)인 수십 가지의 강의 목록이 있다고 가정한다면, 
	// 신청했을 때 현재 값이 1(True)로 바뀌는 것과 같다.
	subject.addStudent(this);
	System.out.println(this.name + " - " + subject.getName() +" 과목 신청완료");
	//this.subject[0]을 해서 객체(Subject의 객체인 subjects[1]) 자체를 출력하면 주소처럼 생긴 문자열이 나온다.
	//따라서 Subject 객체에서 과목 이름을 직접 꺼내 써야한다.
	
}

public void setScore(Subject subject, int scores) {
	this.subjects[this.subjectCount] = subject;
	this.scores[this.subjectCount]= scores;
	this.subjectCount++;
	System.out.println(this.name + " - " + subject.getName() + " 점수 입력완료");
	
}

public void printStudentInfo() {}

public String getName() {
	return this.name;
}


}
