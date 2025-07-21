package sub3;

// StringBuilder 클래스 실습하기

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str)); //객체 주소
		
		str += "Programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		System.out.println(str);
		
		// 빈번한 문자열 변경을 위한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming"); // 주소 값을 변경하지 않고(새로 객체를 생성하지 않고) 내용만 변경
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		System.out.println(sb);
	}
	

}
