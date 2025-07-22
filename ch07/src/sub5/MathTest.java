package sub5;

// 자바 Math 실습

public class MathTest {

	public static void main(String[] args) {
		
		//Math math = new Math();
		//Math는 정적 메서드 속성을 갖는 클래스이기 때문에 위처럼 변수를 생성할 수 없다.
		
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("절대값 : " + Math.abs(5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("제곱근 : " + Math.sqrt(16));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));
		
		// random : 임의의 수
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0~1사이의 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0~10사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1~10 사이의 정수
		
		//======================================================//
		
		// 위 3개의 코드를 중첩시킨 것이 아래 코드이다.
		double rand = Math.ceil(Math.random() * 10);
		System.out.println("rand : " + rand);
		
		// 1~45까지 임의의 정수
		double rand1 = Math.ceil(Math.random()* 45); //맨 뒤에 곱해지는 숫자가 무선으로 출력되는 숫자의 한계점
		System.out.println("rand1 : " + rand1);
	}
}
