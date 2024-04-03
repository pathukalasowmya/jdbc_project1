import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MobileNumberDemo{
	public static void main(String[] args) {
		String path = "C:\\11223/abc.txt";
		File f = new File(path);
	
		 try {
		 FileWriter fw = new FileWriter(f);
		 PrintWriter pw = new PrintWriter(fw);
		 pw.println("8877665544");
		 pw.println("7766554433");
		pw.println("5544332211");
		pw.println("1212121212");
		pw.println("A776655443");
		pw.println("22334#9987");
		pw.flush();
		pw.close();
		pw.close();
		
		 }catch (IOException e) {
		 e.printStackTrace();
	}
	
		
	
				
		}
}
