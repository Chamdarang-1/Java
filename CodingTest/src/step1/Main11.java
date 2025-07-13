package step1;

import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong(); 
		// int로 했더니 InputMismatch runtime error가 나왔다.
		// int의 최대 값이 약 21억 4천일텐데 부족해서 long을 쓴다는 걸까
		// 아 문제값이 10^12이었다................
		
		System.out.println((a+b)+c);
		
		sc.close();
	}
}