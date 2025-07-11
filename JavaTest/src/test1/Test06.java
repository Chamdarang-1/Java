package test1;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다." ; // 물음표는 삼항 연산자의 조건분기,
																// 앞에 조건식 x > y가 sc.nextInt()로 입력된 x,y값을 대입하여 true인지 false 인지 판단하여 선택한다.
		
		System.out.println(result);
	
		
		sc.close();
	}

	
}
