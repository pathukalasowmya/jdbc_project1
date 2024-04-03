package file_handling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFileDemo {
 public static void main(String[] args) {
	 String path = "C:\\11223/courses.txt";
	 
	 File f = new File(path);
	 try {
	 FileWriter fw = new FileWriter(f);
	 PrintWriter pw = new PrintWriter(fw);
	 pw.println("Java Full Stack");
	 pw.println("MEAn Full Stack");
	pw.println("MERN full Stack");
	pw.flush();
	pw.close();
	pw.close();
	
	 }catch (IOException e) {
	 e.printStackTrace();
}
}
}