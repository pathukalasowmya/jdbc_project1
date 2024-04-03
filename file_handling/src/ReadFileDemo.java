import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;




public class ReadFileDemo {
	public static void main(String[] args) {
		
	
	String path = "C:\\11223/courses.txt";
	
	File f = new File(path);
	
	try {
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	while(line  != null) {
		System.out.println(line);
		line = br.readLine();
	}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}catch(IOException e) {
		e.printStackTrace();
		
	}

}
}