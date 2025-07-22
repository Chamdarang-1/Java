package test1_rensyuu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int 	score = sc.nextInt();
		char 	grade= 0; //0인 유니코드 문자로 초기화
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score <= 100) {
			grade ='A';
		}else if (score >= 80 && score <= 89) {
			grade ='B';
		}else if (score >= 70 && score <= 79) {
			grade ='C';
		}else if (score >= 60 && score <= 69) {
			grade ='D';
		}else if (score <= 59 && score >= 0) {
			grade = 'F';
		}else {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}
		
		System.out.printf("등급은 %c 입니다.", grade);
		
		sc.close();
	}
}
