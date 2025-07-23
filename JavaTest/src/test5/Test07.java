package test5;

public class Test07 {
	
	public static void main(String[] args) {
		
		for(int count = 1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}

	??? makeLotto() {
		
		?? lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil();
			lottoSet.add(num);
			
			if(???) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
