package java8features;
 
import java.util.HashSet;

	
public class Task1 {


	public static void main(String[] args) {
		
	
		HashSet<Integer> hs = new HashSet<>();

		hs.add(44);
		hs.add(55);
		hs.add(66);
		hs.add(77);
		hs.add(88);
		hs.add(99);
		
		hs.forEach((num)->System.out.println(num));
		
    System.out.println("-------------");
		hs.forEach(System.out::println);
		System.out.println("----------------");
		
		hs.forEach(( num) -> {
			if (num%2 == 0) {
		System.out.println(num);
			}
			});
}
}

