package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 박요셉
 * 내용 : 자바 연산자 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0; // 실제 정답
		// 내가 한 답 int result = num;
		
	
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}

}
