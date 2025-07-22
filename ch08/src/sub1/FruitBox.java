package sub1;

public class FruitBox<T> {

	private T fruit; //T는 치환변수 // 제네릭 클래스 FruitBox의 치환변수 T를 선언
	
	
	public T getFruit() {
		return fruit;
		
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
