package sub3;

/*
 * 날짜 : 2025/07/08
 * 이름 : 박요셉
 * 내용 : 자바 For 반복문 실습하기
 */

public class ForTest {
	
	public static void main(String[] args) {
		
		// for 리본
		for(int i = 0 ; i < 10 ; i++ ) { 
			//for(초기식; 조건식; 증감식;) i는 반복변수 // i = 0이고 i는 10까지
			// 실행 순서는 i=0, i<10, sysout, i++이다. 디버깅 하면 확인할 수 있다~ 조건식이 참일동안 반복한다.
			System.out.println("i : " + i); 
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum = sum + k; // 맞긴 하지만 잘 사용하지 않는, 좀 더 깔끔한 식은 sum += k;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지 짝수합
		int tot = 0 ;
		
		for(int k=1; k<=10 ; k++) {
			
			if(k % 2 == 0) { //k가 짝수일 때의 조건문
				tot += k;	
			}
			
		}
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		
		// for 중첩 (이중 포문)
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : " + a);
			
			for(int b=1 ; b<=5 ; b++) { // a가 1~3까지이므로 b는 총 a의 값에 대응되어 15번 반복한다.
				
				System.out.println("b : " + b);
			}
		}
		
		// 구구단
		for(int x=1 ; x<=9 ; x++) { // x는 1, x가 9가 될 때까지 실행, 1씩 증가
			
			System.out.println(x + "단"); //변수값 뒤에 "단"을 출력
			
			for(int y=1 ; y<=9 ; y++) { //y는 1, y가 9가 될 때까지 실행, 1씩 증가
				
				int z = x * y; // z는 x와 y를 곱한 값
				
				//서식문자 출력
				System.out.println(x + " x " + y + " = " + z);
				// System.out.printf("%d x %d = %d\n" , x, y, z);
			
			}
		}
		
		// 별삼각형
		for(int start = 10 ; start >= 0 ; start--) {
			
			for(int end = 0 ; end <= start ; end++) {
				
				System.out.print("☆"); // println으로 하면 한 줄씩 나옴
				
			}
			System.out.print("\n"); //혹은 System.out.println(); 로 해도 됨
		}
		// 별삼각형
		for(int start = 0 ; start <= 10 ; start++) {
			
			for(int end = 0 ; end <= start ; end++) {
						
						System.out.print("☆"); // println으로 하면 한 줄씩 나옴
						
					}
					System.out.print("\n"); //혹은 System.out.println(); 로 해도 됨	
		
				}
			 		
	}

}
