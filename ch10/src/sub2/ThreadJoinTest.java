package sub2;

// 자바 스레드 상태 실습하기

class WorkThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		// 작업 스레드 실행
		work.start();
		
		// 작업 스레드 종료 대기 - join(합류)을 넣음으로 메인 스레드가 작업 스레드의 종료를 기다린 후 스레드를 종료한다.
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료..."); // 메인 스레드가 끝나도 작업스레드가 계속 실행 중이라면 Zombie 라고 하고
											// Zombie 상태로 만들면 안 된다.
	}
}

