package sub7;

// 추상 클래스 실습하기
// 왜 추상 클래스를 써야 하는가?

public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상 클래스는 단독으로 객체 생성을 할 수 없음
		// Animal animal = new Animal();
		
		//Tiger tiger = new Tiger();
		//Eagle eagle = new Eagle();
		// 이렇게 해도 되지만 아래처럼 하는 게 더 깔끔하고 낫다.
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		
	}

}
