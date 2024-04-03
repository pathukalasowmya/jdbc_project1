
public class Book {
 private static Book instance = null;

private Book() {
	System.out.println("Book Object is Created");
	
}
public static Book getinstance() {
	if(instance == null) {
		instance = new Book();
	}
	return instance;
	
}

}


