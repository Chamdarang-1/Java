package sub4;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	//하늘색은 속성
	//연파랑은 지역변수
	
	public StockAccount(String bank, String name, String id, 
			int balance, String stock, int amount, int price) {
		
		//this가 없다면 아무 의미가 없는 코드임)
		super(bank, name, id, balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
		// balance에 에러가 뜨는 이유는 부모클래스에서 private로 되어 있기 때문이다.
		// 따라서 private을 자식클래스가 참조가능하게 끔 protected를 사용했다
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price; 
	}
	
	public void show() {
		System.out.println("증권사 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("주식종목 : " + this.stock);
		System.out.println("현재수량 : " + this.amount);
		System.out.println("현재가격 : " + this.price);
	}
	

}
