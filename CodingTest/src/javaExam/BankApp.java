package javaExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankApp {
	
	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start(); 
		
		System.out.println("프로그램 종료");
	}
	public void start() {
		
		boolean running = true;
	
		while (running) {
			printMenu();
			System.out.print("선택> ");
		
		try {
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1 -> createAccount();
			case 2 -> listAccounts();
			case 3 -> depositAccount();
			case 4 -> withdrawAccount();
			case 5 -> {
				running = false;
			}
			default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
			continue;
			}
		}
	}
	
	public void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
	}
	
	public void createAccount() { // 계좌생성 메서드
		
		
		System.out.println("-----------------계좌생성--------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		try {
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine()); 
		}catch (Exception e) {
			System.out.println("유효하지 않은 숫자입니다.");
		}
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		// 입력값으로 객체 생성
		Account acc = new Account(ano, owner, balance);
		
		// 배열에 입력값 저장
		accounts.add(acc);
		
	}
	
	public void listAccounts() { // 계좌목록 메서드
		System.out.println("-----------------계좌목록--------------------");
		
		for (Account acc : accounts) { // List는 반복문으로 전체 데이터를 순회할 수 있다.
		System.out.println(acc.getAno()+" "+ acc.getOwner()+" "+acc.getBalance()) ;
		// for-each문을 사용, accounts 리스트에 있는 각 Account 객채를 acc 변수로 하나씩 꺼낸다.
		}
	}
	
	public void depositAccount() { // 입금 메서드
		
		System.out.println("----------------- 예금 --------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano); // 계좌 찾기 메서드 불러오기
		
		if(account != null) { // 찾았다면 null이 아님
			System.out.println("예금이 성공되었습니다.");
			account.setBalance(account.getBalance()+balance);
		}else {
			System.out.println("계좌가 없습니다.");
		}
		//결과

				
	}
	
	public void withdrawAccount() { // 출금 메서드
		System.out.println("----------------- 출금 --------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano); // 계좌 찾기 메서드 불러오기
		
		//결과
		if(account != null) { // 찾았다면 null이 아님
			System.out.println("출금이 성공되었습니다.");
			account.setBalance(account.getBalance()-balance);
		}else {
			System.out.println("계좌가 존재하지 않습니다.");
		}
	}
	
	public Account findAccount(String ano) {// 계좌 검색 메서드
		for(Account acc : accounts) { //  for 문으로 accounts list의 데이터 값을 조회하면서
			if(acc.getAno().equals(ano)) { //새로이 입력한 Ano와 값이 일치하는지 확인한다.
				 return acc;
			}
		}
	return null;
	}

}