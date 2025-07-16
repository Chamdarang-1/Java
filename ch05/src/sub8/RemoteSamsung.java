package sub8;

// lg와 세부적인 로직까지 똑같을 수 없지만, 큰 틀은 같다. 
// 두개의 클래스를 인터페이스로 연결 했을 때 어떤 점이 같고 다른지를 설명해줘.
public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung poweron...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung poweroff...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung soundDown...");
	}

}
