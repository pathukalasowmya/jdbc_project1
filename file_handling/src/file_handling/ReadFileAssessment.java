package file_handling;
import java .io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileAssessment {

		public static void main(String[] args, String word) {
			String path = "C:\\11223/courses.txt";
			File f = new File(path);

			int characterCount = 0;
			int lineCount = 0;
			int wordCount=0;
			

			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				while(line  != null) {
					}
	
					System.out.println(line);
					lineCount++;
					
				wordCount = word.split("\s").length;
				System.out.println(wordCount);
	  
				

				
			System.out.println("lineCount : "+lineCount);
			System.out.println("WordCount :" +wordCount);
			System.out.println("CharacterCount:"+characterCount);
			 
			}
				}
	  
			}
		}

		
		



