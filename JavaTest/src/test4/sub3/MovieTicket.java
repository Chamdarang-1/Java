package test4.sub3;

class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		
		this.isBooked = false;
	}
	public void bookTicket() {
		if(this.isBooked) {
		System.out.println("이미 예매됨");
			return; // 왜 여기서 메서드를 종료해야 돼??????
		}
		this.isBooked = true;
			System.out.println(this.movieTitle + ", " + this.screenTime + ", " + this.seatNumber + " 예매 완료");
			
	}
	public void cancelBooking() {
		if(!this.isBooked) { // 와 여기서 !를 쓰네.. 몰랐다
			System.out.println("아직 예매 안 됨");
			return;
		}
		this.isBooked = false;
			System.out.println(this.movieTitle + ", " + this.screenTime + ", " + this.seatNumber + " 취소 완료");	
		}
	
	public void printTicketInfo() {
	System.out.println("영화제목 : " + this.movieTitle);	
	System.out.println("상영시간 : " + this.screenTime);	
	System.out.println("좌석번호: " + this.seatNumber);
	System.out.println("예매여부 : "+ (this.isBooked? "YES" : "NO"));
	}
}
