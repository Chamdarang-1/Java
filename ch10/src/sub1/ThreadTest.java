package sub1;

// 스레드 실습하기

class SubThread extends Thread{ // 자식스레드로 받을 스레드 정의 
	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
	
		for(int i=0 ; i<10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println(name + "작업 스레드 실행 : " + i);
		}
		
		System.out.println(name + "작업 스레드 종료...");
	}
	
}

public class ThreadTest {
	
	public static void main(String[] args) {
		
		// 작업 스레드 객체 생성
		SubThread st1 = new SubThread("ST1");
		SubThread st2 = new SubThread("ST2");
		
		// 작업 스레드 실행
		st1.start(); // run이 아니라 start로 실행하면 병행 실행이 된다.
		st2.start();
		
		for(int i=0 ; i<10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("메인 스레드 실행 : " + i);
			
		}
		
		System.out.println("프로그램 종료...");
		
	}

}
