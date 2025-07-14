package sub1;

// 클래스 설계(정의, 추상화, 설계했다.)
public class Car {
	
	
	// 속성(멤버 변수, 필드)
	String name;
	String color;
	int speed;
	
	// 기능(멤버 메서드)
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
		
// 추상화한 클래스를 객체로 만들 거임 ㅇㅇ
		
		
		
		
	}
}
