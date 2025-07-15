package sub6;

// 다형성 실습하기

/*
 * 다형성 (Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *  - 객체 생성할 때 타입 선언을 부모클래스 타입으로 선언(업캐스팅)
 *  적극 활용 해야 하는 이유
 *  - 다형성을 통해 프로그래밍의 중복코드를 줄이고 유연성을 향상시킨다.
 * */


public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성 - 자식 개체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal eagle = new Eagle(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		
		// 하위 클래스로 정의하는 것보다 그 위에 클래스로 정의하는 것이 일반적이다.
		// 예를 들면 호랑이, 독수리, 상어는 각각 호랑이과, 독수리과, 상어과 라고 분류 할 수 있지만
		// 더 상위 개념인 "동물"로 정의할 수 있는 것이 다형성이다.
		// 통일성을 확보할 수 있다.
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		//다운캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅 하는 것
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		// 다형성을 활용한 객체 배열
		Animal[] arr = {t, e, s};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
		
		
	}

}
