package test4.sub5.rensyuu;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;

public Subject (String subName) {
	this.subName = subName;
	this.students = new Student[10];
	this.studentCount = 0;
}
public void addStudent(Student student) {
	students[studentCount++] = student;
	// 이런 코드를 사요했으면~ getter 을 활용해야 한다.
	//System.out.println(student.getName() + " - " + this.subName + " 과목 신청완료");
}


public void printSubjectInfo() {
	System.out.println("과목명 : " + this.subName);
	
	System.out.print("수강생 : " );
	for(int i = 0; i<this.studentCount ; i++) 
		
		System.out.print(this.students[i].getName()+ ", ");
	
	System.out.println();
	
}

public String getName() {
	return this.subName;
}

}
