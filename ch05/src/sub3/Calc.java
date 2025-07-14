package sub3;

public class Calc {
	
	// 싱글톤(singleton) 객체(자주 쓰임) // 오직 한 개의 인스턴스로만 사용하기 위해 사용한다(무슨뜻?)
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // 외부 new 동적 생성을 막기 위해 private 생성자 선언(왜 막아야 할까?)
	
	
	
	public int plus(int a, int b) {
		return a + b ;
	}
	
	public int minus(int a, int b) {
		return a - b ;
	}
	
	public int multi(int a, int b) {
		return a * b ;
	}
	
	public int div(int a, int b) {
		return a / b ;
	}
	

}
