package sub3;

public class Count {
	
	// 생성자로 초기화 하는 거랑 바로 초기화하는 거랑 무슨 차이?
	// 애초에 생성자가 왜 필요한 거지?
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	
	
	// synchronized : 동기화 블럭, 스레드의 경합을 막고 순차적으로 스레드 실행
	public synchronized void setNum() { // c1, c2, c3가 int num 으로 들어오는데, 
									// 순서대로 들어오면 상관이 없지만 거의 동시에 들어오기 때문에 값이 부정확해지고 있다.
									// 따라서 동기화 블록을 걸어주면 무조건 하나씩만 들어와서 실행된다. 
		// 임계영역 : 하나의 스레드가 해당 영역에 들어올 때 Lock을 걸고 영역을 빠져나갈 때 해제한
		this.num++;
		
		
	}

}
