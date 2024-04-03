package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) {
		String path = "C:\\11223/file2C:\\11223C:\\11223C:\\11223.txt";
		File f = new File(path);
		try {
			if(f.createNewFile()) {
				System.out.println("new file is created in " + path);
			}else {
				System.out.println("something wrong");
			}
		}catch (IOException e) {
			e.printStackTrace();
			}
		}
		
	}


