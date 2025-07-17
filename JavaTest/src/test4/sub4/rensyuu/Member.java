package test4.sub4.rensyuu;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
public Member (String name, String memberId) {
	this.name = name;
	this.memberId = memberId;
	
	this.borrowedBook = null;
}

public void borrowBook(Book book) {
	borrowedBook = book;
	book.borrowBook();
}

public void returnBook(Book book) {
	borrowedBook = null;
	book.returnBook();
	
	
}

public void getMemberInfo() {
	System.out.println("회원명 : " + this.name);
	System.out.println("아이디 : " + this.memberId);
	// 대출한 책이 있을 땐 괜찮지만, 대출한 책이 없거나 반납했다면 출력할 데이터가 없어 오류가 발생한다.
	// 따라서 책이 없을 경우의 출력 데이터도 만들어줘야 한다.
	if(borrowedBook != null) { // 대출한 도서의 값이 null 갑이 아니면, getTitle을 출력할 수 있기 때문이다.
		System.out.println("대출한 도서 : " + borrowedBook.getTitle());	
	}else {
		System.out.println("대출한 도서 : 없음");
		}
	}
}




