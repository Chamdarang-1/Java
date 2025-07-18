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
	System.out.println(this.students + " - " + this.subName + " 과목 신청완료");
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
