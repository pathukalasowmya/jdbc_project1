package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Angular","Java","Python","React");
		System.out.println(courses);
		
		Consumer<String> consumer = (course) -> System.out.println(course);
		courses.forEach(consumer);
		
		List<Integer> numbers = Arrays.asList(44,55,66,77,88,99);

        System.out.println(numbers);
      
        numbers.forEach((num)->System.out.println(num));
        
      
        

}
}