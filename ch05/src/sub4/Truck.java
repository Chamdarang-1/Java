package sub4;

public class Truck extends Car {
	
	private int capacity; // 적재용량

	public Truck(String name, String color, int speed, int capacity) {
		
		super(name, color, speed);
		this.capacity = capacity; // (초기화)
	}
	
	public void load (int capacity) {
		this.capacity += capacity; // 왜 += capacity 임??
		// += 인 이유는 새로운 적재량을 입력할 때마다 적재량을 누적시켜서 연산하기 위해서다.
		// = 로 사용한다면 적재량이 누적되어 연산되지 않고, 새로운 적재량 값으로 덮어쓰여진다.
		
	}
	
	public void show() {
		super.show();
		System.out.println("현재 적재량 : " + this.capacity);
	}

}
