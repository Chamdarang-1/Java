package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/08
 * 이름 : 박요셉
 * 내용 : 자바 Swtich 조건문 실습하기
 */

public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in); // 객체를 생성하는 것, Scanner는 클래스 타입이기 때문에 sc는 객체이다. new는 객체생성명령어, System.in의 in은 키보드로 입력하는 값을 말한다.
		int number = sc.nextInt(); // 숫자 입력, 입력된 숫자는 number 변수로 들어감
		
		System.out.println("입력한 숫자 : " + number);
		
		switch(number % 2) {
		//switch(조건 결과값)
		
		case 0 :
			System.out.println("number는 짝수 입니다.");
			break; //조건식 탈출, 없으면 그 다음 case 실행
			
		case 1 :
			System.out.println("number는 홀수 입니다.");
			break;
				}
			}
}
