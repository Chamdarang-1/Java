package test4_1;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
	this.studentName = studentName;
	this.studentId = studentId;
	this.subject = subject;
	this.score = score;
	}
	
	// 여기부터 
	public void updateScore(double score) {
		
		if(score > 100) {
		System.out.println("잘못된 점수 입력");
		}else {
			this.score = score;
			System.out.println("점수 수정 완료");
		}
	}
	// 여기까지 헷갈려서 틀림
	public double getScore() {
		return this.score; 
		
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : " + this.studentName);
		System.out.println("학생 ID : " + this.studentId);
		System.out.println("과목 : " + this.subject);
		System.out.println("점수 : " + this.score);
		
	}
}
