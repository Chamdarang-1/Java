package sub3;

// 클래스 설계(정의, 추상화, 설계했다.)
public class Car {
	
	
	// 속성(멤버 변수, 필드) - 속성은 무조건 private으로 선언
	private String name;
	private String color;
	private int speed;
	// 외부에서는 참조되지 못한다. 즉, 외부에서 안 보이기 때문에 더 안전하다.
	
	// 전체 차량 수를 저장하는 클래스 변수
	public static int count; // 클래스 변수(정적변수)는 일반적으로 public
	
	// 생성자(Constructor) - 속성을 초기화하는 반환타입이 없고 클래스명인 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; // 차량 증가
	}
	
	// 기능(멤버 메서드) - 메서드는 웬만하면 public(초보자한테는 무조건), 기능은 외부에 공개해줘야 가져와서 사용할 수 있게 된다.
	public void speedUp(int speed) {
		
		//this는 자기 참조 키워드, 클래스의 멤버변수 참조
		this.speed += speed; // 아래 speed들은 원래 바로 위에 매개변수 speed를 참조했는데, this.를 써서 속성에 있는 speed의 값을 넣게 만듦
		
	}
	
	public void speedDown(int speed) { // 얘는 왜 생략하면 안 되는지 GPT한테 물어보기
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량명 : " + name); // this 생략
		System.out.println("차량색 : " + color); // this 생략
		System.out.println("현재 속도 : " + speed);
	}	
// 추상화한 클래스를 객체로 만들 거임 ㅇㅇ
		
	// Getter/Setter은 은닉된 속성을 안전하게 처리하기 위한 메서드
	// 외부에서 직접 참조하면 위헙하기 때문이다.
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
	// 클래스 메서드
	public static int getCount() {
		return count;
	}
	
}
