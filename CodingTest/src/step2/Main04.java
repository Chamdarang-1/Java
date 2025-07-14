package step2;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int result;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0 && y>0) {
			result = 1;
		}else if (x<0 && y>0) {
			result = 2;
		}else if (x<0 && y<0) {
			result = 3;
		}else if (x>0 && y<0) {
			result = 4;
			
		System.out.println(result);
		sc.close();
			
		}
	}
}
