package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

// 에외 처리 

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		//===================================================
		// 실행 예외(Runtime에 발생) - 프로그램이 실행 중에 발생하는 에러
		//===================================================

		
		// 예외 상황 1 - 어떤 수를 0으로 나눌 때
 
		int num1 = 1;
		int num2 = 0;
		
		try {
			// 에외가 발생할 수 있는 코드 작성
			int r1 = num1 + num2;
			int r2 = num1 - num2;
			int r3 = num1 * num2;
			int r4 = num1 / num2;
		
			System.out.println("r4 : " + r4);
			
		}catch (Exception e) {
			// 예외가 발생했을 때
			System.out.println("예외 내용 : " + e.getMessage());
		}
		//===================================================
		// 예외 상황 2 - 배열 인덱스 참조가 잘못됐을 때
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i=0 ; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch (Exception e) {
			// 예외내용 콘솔 출력
			e.printStackTrace();
		}
		//===================================================		
		// 예외 상황 3 - 객체생성을 하지 않고 메서드를 호출할 때
		Animal animal = null;
		
		try {
			animal.move();
		}catch (Exception e) {
				e.printStackTrace();
		}
		
		//===================================================
		// 예외상황 4 - 잘못된 캐스팅
		
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle();
		try {
		Tiger tiger = (Tiger)a2; // 잘못된 다운캐스팅
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		//===================================================
		// 일반 예외(Compile-time에 발생) - 프로그램을 실행하기 전에 발생하는 에러(코딩하다가 문제있으면 빨간밑줄 ㅇㅇ)
		//===================================================
		
		// 동적 개체 생성
		try {
			Class cs = Class.forName("sub1. Tiger"); // 문자열 정보로 클래스 로드
			Constructor<?> constructor = cs.getDeclaredConstructor();
			Tiger tiger = (Tiger) constructor.newInstance();
			
			tiger.move();
			tiger.hunt();
		
		}catch (Exception e) {

		}
			/*	하위 예외 처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		*/
		
		System.out.println("프로그램 정상 종료...");
	}
}
