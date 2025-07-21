package sub2;

// String 클래스 실습

public class StringTest {

	public static void main(String[] args) {
		
		// 문자열(문자+배열) 생성
		String str1 = "Hello"; //문자열 literal
		String str2 = new String("Hello");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1, str2 문자열의 주소값이 같다.");
		}else {
			System.out.println("str1, str2 문자열의 주소값이 다르다.");
		}
			// 결과 값이 다르다고 나옴.
			// 일반 변수는 stack에 저장이 되지만 String은 객체이기 때문에 Heap에 String 객체가 생성이 되는 것이다.
			// 즉 String은 배열이기 때문에 위 코드는 주소 값을 비교하는 것이다.
		
		if(str1.equals(str2)) { // equals 중요하다!!!!!!!! // 문자열 비교는 반드시 equals로 비교
			System.out.println("str1, str2 문자열이 같다.");
		}else {
			System.out.println("str1, str2 문자열이 다르다.");
		}
		
		// 문자열 길이
		String message = "Hello, Korea";
		System.out.println("길이 : " + message.length());
		
		
		// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(7);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열 자르기
		String substr1 = message.substring(0,5); // 0부터 5까지 문자열
		String substr2 = message.substring(5);	// 5부터 마지막까지 문자열 
		
		System.out.println("substr1 : "+ substr1);
		System.out.println("substr2 : "+ substr2);
		
		// 문자열 인덱스
		int idx1 = message.indexOf('o'); // 문자열 앞에서부터 문자를 찾아주는 메서드
		int idx2 = message.lastIndexOf('e'); // 문자열 뒤에서부터 문자를 찾아주는 메서드
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		
		// 문자열 분리
		String [] words = message.split(","); // 구분자 ,로 문자열 분리
		
		for(String word : words) {
			System.out.println(word);
		}
		
		// 문자열 교체
		String rs1 = message.replace("Korea", "Busan");
		String rs2 = message.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " +rs1);
		System.out.println("rs2 : " +rs2);
				
		// 문자열 변환
		int var1 = 1;
		double var2 = 2.1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		//"" + var3이 String.valueOf(var3)과 같나?
		
		System.out.println(s1 + "2");
		System.out.println(s2 + "1.2");
		System.out.println(s3 + "false");
		
		
	}
}
