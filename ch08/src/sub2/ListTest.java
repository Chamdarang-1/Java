package sub2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub1.Apple;


// 자바 리스트 실습하기

public class ListTest {

	public static void main(String[] args) {
		
		// ArrayList 기본
		List<Integer> list = new ArrayList();
		
		
		// E는 Elements, list의 속성이 숫자라면 int를 넣으면 되지만, 제네릭은 기본 자료형을 취급하지 않는다.
		// 따라서 Wrapper = Integer, Boolean 등을 사용해야 한다.
		
		
		// 데이터 삽입
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1, 6);
		System.out.println(list);
		
		// 데이터 제거
		list.remove(2);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		// 데이터 출력
		System.out.println("list 1번째 원소 : " + list.get(0));
		System.out.println("list 2번째 원소 : " + list.get(1));
		System.out.println("list 3번째 원소 : " + list.get(2));
		
		// 리스트 크기
		System.out.println("list 크기 : " + list.size());
		
		// 리스트 반복
		for(int num : list) { // Auto-Unboxing 잘 모르겠다..
			System.out.println("num : " + num);
		}
		
		// 문자열 리스트 실습
		List<String> people = new ArrayList<String>()	;
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		// 마지막에 '정약용' 추가
		people.add("정약용");
		System.out.println(people);
		
		// 강감찬 - 이순신 사이에 '이성계' 삽입
		people.add(4, "이성계");
		System.out.println(people);
		
		// 김유신 - 김춘추 사이에 '비담' 삽입
		people.add(1, "비담");
		System.out.println(people);
		
		// 장보고 제거 후 '왕건' 삽입
		// people.remove(people.indexOf("장보고"));
		people.remove(3);
		people.add(3, "왕건");
		System.out.println(people);
		
		// "이성계'를 '정도전'으로 교체
		people.set(5, "정도전");
		System.out.println(people);
		
		/////////////////////////////
		///객체 리스트 실습
		/////////////////////////////
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("일본", 2000);
		
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("중국", 1000));
		
		Apple koreaApple = apples.get(0);
		System.out.println(koreaApple);
		
		for(Apple apple : apples) {
			System.out.println(apple);
			
		/////////////////////////////
		/// LinkedList
		/////////////////////////////
			
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		
		System.out.println(cities);
		
		//데이터 삽입
		cities.add(1, "수원");
		cities.addFirst("인천");
		cities.addLast("울산");
		
		System.out.println(cities);
		
		
		}
		
		
	}
}
