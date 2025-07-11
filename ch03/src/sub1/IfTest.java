package sub1;

/*
 * 날짜 : 2025/07/08
 * 이름 : 박요셉
 * 내용 : 자바 조건문 실습하기
 */


public class IfTest {

	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {			
			// 조건이 참일 때, 실행
			System.out.println("num1이 num2보다 작다.");
		}
		
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
		}
		
		if(num1 > 0) {
			
			if(num2 > 1) {
				// if 중첩 = 두 조건을 모두 만족해야지 실행
				System.out.println("num1은 0보다 크고, num2는 1보다 크다.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
				// if 중첩과 같은 논리를 지녔다.
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		}
			
		
		// if ~ else
		
		int var1= 1, var2 = 2;
		
		if(var1 > var2) {
			// 조건이 참일 때
			System.out.println("var1은 var2보다 크다.");
		}else {
			// 조건이 거짓일 때
			System.out.println("var1은 var2보다 작다.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			// 총 3개의 조건을 검사한다.
			System.out.println("n1은 n2보다 크다");
			
		}else if(n2 > n3) {
			
			System.out.println("n2는 n3보다 크다");
			
		}else if(n3 > n4) {
			
			System.out.println("n3는 n4보다 크다");
			
		}else {
			
			System.out.println("n4가 제일 크다");
		}
		
		
		
		
	}
}
