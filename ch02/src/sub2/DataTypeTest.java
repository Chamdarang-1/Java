package sub2;

/*
 * 날짜 : 2025/07/07
 * 이름 : 박요셉
 * 내용 : 자바 변수 자료형 실습하기
 */
public class DataTypeTest {
	
	public static void main(String[] args) {
		
		// 정수형
		byte num1 = 127; //byte는 -128~127 , 1byte
		short num2 = 32767; //2byte
		char num3 = 97; //2byte
		int num4 = 2147483647; // 4byte
		long num5 = 9_223_372_036_854_775_807L; //마지막 L은 long 일때 접미사로 붙이는 것, 8byte 
		
		System.out.println("num : " + num1);
		System.out.println("num : " + num2);
		System.out.println("num : " + num3);
		System.out.println("num : " + num4);
		System.out.println("num : " + num5);
		
		// 실수형
		float var1 = 0.123456789f; //float은 접미사로 소문자 f를 사용해야 한다. , 4byte
		double var2 = 0.1234567890123456789; // 8byte
		
		System.out.println("var1 : " + var1); // 소수점 8자리까지
		System.out.println("var2 : " + var2); // 소수점 17자리까지(더 정밀하다.)
		
		// 논리형
		boolean value1 = true; //참거짓 논리 자료형인 boolean
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 :" + c1);
		System.out.println("c2 :" + c2);
		
		int n1 = c1; // char는 정수형 타입이기 때문에 int형으로 대입가능(A는 아스키코드로 65이다)
		System.out.println("n1 : " + n1);
		
		// 문자열
		String s1 = "A"; // 문자형은 작은따옴표를('')를 쓰지만, 문자열은 큰따옴표("")를 쓴다.
		String s2 = "가";
		String s3 = "Apple";
		String s4 = "가을";
		String s5 = "";

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);
	}

}
