package test4.sub4.rensyuu;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
public Book (String title, String author, String isbn) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	
	this.isBorrowed = false; // 대출하지 않은 상태
	
}
public void borrowBook() {
	if(this.isBorrowed) {
		System.out.println(this.title + " 이미 대출 됨");
		return;
	}
		this.isBorrowed = true;
		System.out.println("도서대출 : " + this.title);
		
}

public void returnBook() {
	if(this.isBorrowed) {
		System.out.println("도서반납 : " + this.title);
			}
		}

public void getBookInfo() {
	System.out.println("도서명 : " + this.title);
	System.out.println("저자 : " + this.author);
	System.out.println("isbn : " + this.isbn);
	System.out.println("대출여부 : " + (this.isBorrowed ? "불가능" : "가능"));
	
}


public String getTitle() {
	return title;
}

}


