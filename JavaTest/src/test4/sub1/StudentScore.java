package test4.sub1;

public class StudentScore {
	
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore (String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public void updateScore(double score) {	
			
		if(score > 100 || score < 0) { // 입력 받을 점수는 this.score가 아닌 score(임시 값), 
			System.out.println("잘못된 점수 입력"); // this.score는 실제 출력이 되는 값
		}else {
			this.score = score; 
			System.out.println("점수 수정 완료");
		}
	}
	
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : "+ this.studentName);
		System.out.println("학생 ID : "+ this.studentId);
		System.out.println("과목 : "+ this.subject);
		System.out.println("점수 : "+ this.score);
		
	}

}
