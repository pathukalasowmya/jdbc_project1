package collections1;

import java.util.ArrayList;


public class ArrayListDemo {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
				System.out.println(al.size());
				System.out.println(al);
				
				al.add(100);
				al.add(200);				
				System.out.println(al.size());
				System.out.println(al);
				
				al.add("Java");
				al.add("Angular");
				System.out.println(al.size());
				System.out.println(al);
				
				al.add(55.0);
				al.add(440.0);
				System.out.println(al.size());
				System.out.println(al);
				
				al.remove(0);
				al.remove("spring");
				System.out.println(al.size());
				System.out.println(al);
				
				al.add("Angular");
				System.out.println(al);
				
				al.add("Sowmya");
				System.out.println(al);
				
				Object obj = al.get(1);
				System.out.println(obj);
				
				al.set(1, al.get(1)+"17");
				System.out.println(al);
				
						
    		
	}

}
