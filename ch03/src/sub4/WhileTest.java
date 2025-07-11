package sub4;

/*
 * 날짜 : 2025/07/08
 * 이름 : 박요셉
 * 내용 : 자바 While 반복문 실습하기
 */

public class WhileTest {

	public static void main(String[] args) {
		
		
		// 1부터 10까지 합
		int sum = 0 ; 
		int k = 1;
		
		while(k <=10) {
			
			sum+= k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// do-while : 최초 무조건 1번 반복 실행
		int tot = 0;
		int j = 1;
		
		do{
			if(j % 2 == 0 ) {
				tot += j;
			}
			
			j++;
			
		}while(j <= 10); // 한번은 무조건 실행하는데 그 이후는 조건 보고 한다는 거지
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		// break
		int num = 1;
		
		while(true) { //무한반복 시켜놓고 조건 만족시 탈출
			
			if(num % 5 == 0 && num % 7 == 0) {
				break; // 반복문 탈출(종료)
			}
			
			num++;
		
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
	
		
		// continue
		int total = 0;
		int i = 1;
	
		while(i <= 10) {
			
			i++;
			
			if(i % 2 == 1) {
				continue; // 반복문 상위로 이동
			}
			
			total += i;
		}
		
		System.out.println("1부터 10까지 짝수합 : " + total);
	}
}
