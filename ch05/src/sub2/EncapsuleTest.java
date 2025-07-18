package sub2;

// 캡슐화 실습하기
/*
 * 캡슐화(정보 은닉, Encapsulation)
 * - 캡슐화는 객체의 속성을 외부에서 참조하지 못하게 객체의 속성을 은닉하는 특성
 * - 클래스의 속성을 반드시 private 으로 선언
 * - private 선언을 하면 생성자(Constructor)로 속성을 초기화
 * - 은닉된 정보(속성)를 안전하게 사용하기 위해 Getter, Setter 사용
 * 
 * */


public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// 객체 생성과 초기화
		Car sonata = new Car("소나타", "흰색", 0); // 이렇게 하믄 객체 생성과 초기화를 한꺼번에 할 수 있음. 
		
		// 초기화 - 은닉된 속성(멤버변수)은 클래스에서 생성자를 만들고 생성자(Constructor)로 초기화
		// sonata.name = "소나타";
		// sonata.color = "흰색";
		// sonata.speed = 0;
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 생성과 초기화
		Car avante = null;
		avante = new Car("아반테", "검정색", 0); 
		
		//여기서는 name의 값을 바꾸거나, color을 바꾸기 위해
		// avante.color = "남색"; 같은 코드를 사용하지 못한다.
		// 개별 속성이 은닉되어 있기 때문에 속성 수정이 불가하기 때문에, Setter을 쓴다.
		
		avante.speedUp(60);
		avante.speedDown(20);
		
		avante.setColor("남색");
		
		avante.show();
		
		//Account 객체 생성 초기화(국민은행, 10-11-1001, 김유신, 10000)
		
		//출력 30000
		//이름을 김유신 -> 김유진
		
		Account kb = new Account("국민은행", "김유신", "101-11-1001", 10000);
		
		kb.deposit(30000);
		kb.withdraw(10000);
		
		kb.setName("김유진");
		kb.show();
		
		// Account 객체 생성 초기화(우리은행, 101-21-2001, 30000)
		
		// 출력 50000
		
		// 은행명 수정 우리은행 -> 너희은행
		
		Account wr = null;	
		wr = new Account("우리은행", "김춘추", "101-21-2001", 30000);
		
				
		wr.deposit(30000);
		wr.withdraw(10000);
				
		wr.setBank("너희은행");
		wr.show();

		//
		Book book1 = new Book("삼국지", "나관중", "10001" , 10);
		book1.show();
		
		boolean is0k = book1.borrowBook();
		
		if(is0k) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("명품 Java", "ghkdrlxo", "10002", 1);
		
		boolean is0k1 = book2.borrowBook();
		boolean is0k2 = book2.borrowBook();
		
		if(is0k2) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		book2.show();
	}

}
