package collections1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Long>hs = new HashSet<>();
		hs.add(8877665544L);
		hs.add(8872345987L);
		hs.add(9876543210L);
		hs.add(7654321908L);
		System.out.println(hs);
		for (Long element: hs){
			System.out.println(element);
		}
	}

}
