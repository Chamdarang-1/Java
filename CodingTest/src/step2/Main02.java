package step2;
// 시험 점수를 입력받아 90 ~ 100점은 A, 
// 80 ~ 89점은 B, 
// 70 ~ 79점은 C, 
// 60 ~ 69점은 D, 
// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) 
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
			System.out.println(grade);
			sc.close();
	}
}
