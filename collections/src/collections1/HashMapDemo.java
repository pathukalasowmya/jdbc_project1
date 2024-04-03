package collections1;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer >hm = new HashMap<>();
		hm.put("JFS", 100);
		hm.put("PFS", 200);
		hm.put("MEAN", 150);
		hm.put("MERN", 150);
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
for(Map.Entry<String, Integer> entry : hm.entrySet()) {
	System.out.println(entry);
	System.out.println(entry.getKey()+"--"+entry.getValue());
}

	}

}
