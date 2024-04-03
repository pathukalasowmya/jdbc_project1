package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {
	public static void main(String[] args) {
		String path = "C:\\11223/folder2";
		File f = new File(path);
	
			if(f.mkdir()) {
				System.out.println("new folder is created in " + path);
			}else {
				System.out.println("something wrong");
			}
		
		}
	}
		
	


