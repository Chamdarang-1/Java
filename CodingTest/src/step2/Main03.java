package step2;
// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
// 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a;
		int result;
		
		a = sc.nextInt();
			if (a % 4 == 0 && (a % 100 != 0|| a % 400 == 0)) {
				result = 1;
			} else 
				result = 0;
// 논리적으로 100의 배수가 아니면서 400의 배수인 수는 없다.
// 따라서 4의 배수이고, (100의 배수가 아니거나 400의 배수)로 AND연산자와 OR 연산자, 
// !=로 반전술식을 사용하여 문제를 풀어야 했다.......채찍피티 없었으면 진짜 힘들었을듯

		System.out.println(result);
		sc.close();
		}	
	}
