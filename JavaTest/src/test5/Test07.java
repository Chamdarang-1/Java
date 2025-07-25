package test5;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Test07 {
	
	public static void main(String[] args) {
		
		for(int count = 1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}

	public void Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random() * 46);
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
