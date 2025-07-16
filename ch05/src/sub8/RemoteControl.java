package sub8;

// 인터페이스 - 클래스 구현을 위한 오직 추상메서드만 갖는 구조체
// 클래스 상속이라고 하지 않는다.(why?)
public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public abstract void chUp(); //abstract 생략
	public abstract void chDown();
	
	public abstract void soundUp();
	public abstract void soundDown();
	
	

}
