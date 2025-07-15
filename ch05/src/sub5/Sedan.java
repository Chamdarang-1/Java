package sub5;
// 왜 굳이 상속을 받아야 하나?

public class Sedan extends Car {

	
	private int cc; // 배기량
	
	private final int MAX_SPEED = 180;
	//최대 속도는 고정된 값이므로 상수(final)로 지정
	//상수(Constant) - 최초 한번 초기화된 값으로 고정된 변수
	
	public Sedan(String name, String color, int speed, int cc) {
		// 부모클래스 생성자 호출, 자식클랫는 부모클래스 속성을 초기화해줘야 됨(부모클래스랑 속성이 중복되면 안 됨)
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		// 부모클래스 speedUp을 자식클래스에 맞게 재정의
		
		this.speed += speed;
		
		if(this.speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
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
