
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CreateNewFileMethod {

		public static void main(String[] args) {
			String path = "C:\\11223/courses.txt";
			File f = new File(path);

			int characterCount = 0;
			int lineCount = 0;
			
			

			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				while(line  != null) {
					String words = "java python";
					String words2 = "React js";
					System.out.println(line);
					lineCount++;
					
				int wordCount = words.split("\s").length;
				System.out.println(wordCount);
				

				
			System.out.println("lineCount : "+lineCount);
			System.out.println("WordCount :" +wordCount);
			System.out.println("CharacterCount:"+characterCount);
				}
	  
			}
		}
}
		
		
