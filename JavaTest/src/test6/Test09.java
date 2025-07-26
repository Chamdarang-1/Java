package test6;

enum Gender{
	Male, Female
}

class Man {
	public void print() {
		
		System.out.println("남자입니다.");
	}
}

class Woman {
	public void print() {
		
		System.out.println("여자입니다.");
	}
}

public class Test09 {
	public static void main(String[] args) {
		
		Object human1 = makeHuman(Gender.Male);
		Object human2 = makeHuman(Gender.Female);
		
		if (human1 instanceof Man) { // human1이 Man의 객체(인스턴스)가 맞니?
			Man man = (Man) human1;
			man.print();
		}
		
		if (human2 instanceof Woman woman) { // human1이 Man의 객체(인스턴스)가 맞니?
			woman.print();
		}
	}

	public static Object makeHuman(Gender gender) {
		if(gender == Gender.Male) {
			return new Man();
		}else if (gender ==Gender.Female) {
			return new Woman();
		}
		return null;
	}


}
