package collections1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) {
		LinkedHashSet<Long>hs = new LinkedHashSet<>();
		hs.add(8877665544L);
		hs.add(8872345987L);
		hs.add(9876543210L);
		hs.add(7654321908L);
		hs.add(null);
		System.out.println(hs);
		
		for (Long element: hs){
			System.out.println(element);
		}
	}

}
