package sub3;

/*
 * 날짜 : 2025/07/07
 * 이름 : 박요셉
 * 내용 : 연산자 실습하기
 * */



public class OperatorTest {

	public static void main(String[] args) {
		
		//산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4; //변수 4개 선언, 변수 이름이 중복되면 안 됨
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num3 * num2;
		int result4 = num4 / num2;
		int result5 = num4 % num3; // 나머지를 구하는 연산자
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		//증감연산자
		int num = 0; // num 변수를 1 증가하라/ 연산자 위치는 상관없음
		
		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		//복합대입연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1;
		n2 -= 2; // n2 = n2 - 2;
		n3 *= 3; // n3 = n3 * 3;
		n4 /= 4; // n4 = n4 / 4;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		//비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2; 	// 결과는 변수1과 변수2를 비교했을 때 
		boolean rs2 = var1 < var2; 	//크냐 작냐를 따지는 것이기 때문에 참 거짓을 정의하는 boolean을 사용해야 한다.
		boolean rs3 = var1 >= var2; // 크거나 같다 	
		boolean rs4 = var1 <= var2; // 작거나 같다
		boolean rs5 = var1 == var2; // 서로 같다
		boolean rs6 = var1 != var2; // 서로 다르다	
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);
		System.out.println("rs6 : " + rs6);
		
		//논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // 비교연산자와 같이 참거짓을 따지는 boolean 사용
		boolean res2 = (var3 > 2) && (var4 > 3);
		boolean res3 = (var3 > 3) || (var4 > 3);
		boolean res4 = (var3 > 4) || (var4 > 5);
		boolean res5 = !(var3 > var4); // !는 반전술식. NOT이다. true를 false로 바꾸거나 그 반대.
		 
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		
	}
}
