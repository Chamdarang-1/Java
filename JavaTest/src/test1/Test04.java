package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = 0; // 등급을 나타낼 변수 선언 / char grade = 0 으로 grade 변수를 초기화 했다. 왜?
			
		System.out.println("입력한 점수는 " + score + "입니다.");
		
	if (score >= 90 && score <= 100)
		grade = 'A';
	else if (score >= 80 && score <= 89)
		grade = 'B';
	else if (score >= 70 && score <= 79)
		grade = 'C';
	else if (score >= 60 && score <= 69)
		grade = 'D';
	else {
		grade = 'F';
	}
	System.out.printf("등급은 %c입니다." , grade);
	}
}
