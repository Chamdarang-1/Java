package test1_rensyuu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X값 입력 :  ");
		int x = sc.nextInt();
		
		System.out.print("Y값 입력 :  ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
		
		sc.close();
		
	}
}
