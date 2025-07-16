package test3;

class Student {
	public static int studentId;
	private String studentName;
	private String Major;
	private int grade;
	
	public Student(String studentName, String Major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.Major = Major;
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("-----------------");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+Major);
		System.out.println("학년 : "+grade);
	}
	
}


public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000; // 정적변수 studentId
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
		
	}

}
