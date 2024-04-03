package collections1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>ts = new TreeSet<>();
		ts.add("ReactJs");
		ts.add("Angular");
		ts.add("Java");
		ts.add("Spring");
		ts.add("Python");
		System.out.println(ts);
		
		for (String element : ts) {
			System.out.println(element); 
		}
	}

}
