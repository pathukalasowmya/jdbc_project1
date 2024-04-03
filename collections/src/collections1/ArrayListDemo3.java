package collections1;

import java.util.ArrayList;

public class ArrayListDemo3

	public static void main(String[](args)
			{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(400);
		a1.add(300);
   System.out.println(al);
   
 System.out.println("Using for loop");
 for (int i = 0; i<a1.size(); i++) {
	 System.out.println(a1.get(i));
 }

//from 1.5v
   System.out.println("Using for each loop");
for(Integer element :al) {
	System.out.println(element);
}

System.out.println("Using for each()with another reference");
 al.forEach(System.out::println);
	}

