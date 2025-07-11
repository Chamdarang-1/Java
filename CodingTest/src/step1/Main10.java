package step1;

import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자 첫번째 자리를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("두번째 숫자 두번째 자리를 입력하세요 : ");
		int c = sc.nextInt();
		
		System.out.print("두번째 숫자 세번째 자리를 입력하세요 : ");
		int d = sc.nextInt();
		
		int e = ((a*b)+(a*c)+(a*d));
		
		System.out.println(a*b);
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(e);
		
	}

}
