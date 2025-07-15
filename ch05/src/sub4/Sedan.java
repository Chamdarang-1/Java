package sub4;
// 왜 굳이 상속을 받아야 하나?

public class Sedan extends Car {

	
	private int cc; // 배기량
	// name, color, speed 는 부모 클래스에서 상속받은 것
	public Sedan(String name, String color, int speed, int cc) {
		// 부모클래스 생성자 호출, 자식클랫는 부모클래스 속성을 초기화해줘야 됨(부모클래스랑 속성이 중복되면 안 됨)
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void turbo() {
		// 보모 클래스 speed 참조를 위해 접근 권한을 private 에서 protected로 변경
		this.speed += 10;
		// speed가 car에서 캡슐화 되어 있기 때문에 참조가 안 됨.
	}
	public void show() {
		super.show(); // 부모 클래스 show() 호출
		System.out.println("배기량 : " + this.cc);
	}

}
