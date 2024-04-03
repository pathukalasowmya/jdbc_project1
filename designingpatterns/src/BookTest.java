
public class BookTest {


		public static void main(String[] args) {
			Book b1 =  Book.getinstance();
		    Book b2 =  Book.getinstance();
	       
	        
	      
	        System.out.println(b1.hashCode());
	        System.out.println(b2.hashCode());
	        System.out.println(b1 == b2);
		}

	}



