
public class WordCount {

	public static int count(String str,String findStr) {
		int count = 0;
		//String lowercase = str.tolowerCase();
		String arr[]=str.split(" ");
		for (String eachItem : arr) {
			if(eachItem.equalsIgnoreCase(findStr)) {
				count += 1;
				
			}
		}
	
       return count;
    
	}
  public static void main  (String args[]) {
	String str = "java python Java html java python";
	String findstr = "java";
	int count = count(str,findStr);
	System.out.println(count);
}
}
