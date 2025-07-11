package sub3;

/*
 * 날짜 : 2025/07/09
 * 이름 : 박요셉
 * 내용 : 자바 메서드 형태 실습하기
 * 
 */


public class MethodType {

	public static void main(String[] args) {
		
		//메서드 호출한대 뭐야;;
		double y1 = type1(2.5);
		double y2 = type1(3.2);
		double y3 = type1(4.0);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		// 반환 값은 없으니 앞에 개인연산자가 나올 수 없다.
		type2(true);
		type2(false);
		type2(2 > 3); 
		
		
		// 매개변수는 없으나 반환값은 있으니 메서드 호출을 해야한다. (메서드 호출이 뭐고 왜 호출해야 하는가?)
		boolean result = type3();
		System.out.println("result : " + result);
		
		type4();
		
	}
	
	// type1 : 매개변수 O, 반환값 O
	public static double type1(double r) { // 왜 void가 아니고 double일까)
		
		double y = r * r * Math.PI;
		return y;
	}
	
	
	// type2 : 매개변수 O, 반환값 X
	public static void type2(boolean status)	{//return 값이 없을 땐 boolean을 쓰는 듯?

		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// type3 : 매개변수 X, 반환값 O
	public static boolean type3()	{ // void가 아니라 boolean을 써야한대. 왜일까?)
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2)	{
			return true;
		}else {
			return false;
		}
	}
	
	// type4 : 매개변수 X, 반환값 X
	public static void type4()	{ // 다른 메서드를 호출한대. 왜지?
	
	double result = type1(5.0); // 이게 머한거지
	System.out.println("반지를 5인 원의 넓이 : " + result);
		
	}
}
