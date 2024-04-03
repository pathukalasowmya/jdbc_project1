package collections1;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//normal ArrayList
		ArrayList all = new ArrayList();
		all.add(100);
		all.add("Java");
		all.add(3.14F);
		all.add('M');
		System.out.println(all);
		Object obj =all.get(0);
		int element = (int)obj;
		System.out.println(element);
		
		//generic Arrylist
		//Homogenous elements
		//no type casting is required at the time of retrival
		ArrayList<Integer> a12 = new ArrayList<>();
		a12.add(100);
		a12.add(200);
		System.out.println(a12);
		
		ArrayList<String>a13 = new ArrayList<>();
		a13.add("Java");
		a13.add("Spring");
		System.out.println(a13);

	}

}
