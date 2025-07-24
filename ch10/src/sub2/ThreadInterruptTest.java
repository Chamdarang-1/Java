package sub2;

// 스레드 상태 실습
// 일시정지는 왜 해야 돼?

class SubThread extends Thread{
	
	
	@Override
	public void run() {
		
		int i = 1;
		
		try {
		
		while(true) { // while 문에 종료 조건이 없다. interrupt를 걸어서 예외를 발생시킬 것.
			
			System.out.println("SubThread - : " + i);
			i++;
			
				Thread.sleep(1000);
			}
	
		} catch (Exception e) {
		
		}
	}
}


public class ThreadInterruptTest {
	
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		sub.start();
		
		try {
			// 메인 스레드 10초 대기
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
	}

}
