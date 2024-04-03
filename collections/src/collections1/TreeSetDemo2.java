package collections1;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Integer>ts = new TreeSet<>(new MyComparator());
		ts.add(300);
		ts.add(500);
		ts.add(200);
		ts.add(400);
		ts.add(100);
		System.out.println(ts);
		
		for (Integer element : ts) {
			System.out.println(element); 
		}
	}

}
