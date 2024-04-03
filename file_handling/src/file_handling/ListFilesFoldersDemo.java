package file_handling;

import java.io.File;
import java.io.IOException;

public class ListFilesFoldersDemo {
	public static void main(String[] args) {
		String path = "C:\\11223";
		File f = new File(path);
	
   String[]files = f.list();
   
   for(String file: files) {
	   if(!file.endsWith(".txt"))//if you want to display only files  //
	   System.out.println(file);//for only folders use !
	   

			}
	System.out.println(f.exists());
	
	System.out.println(f.isFile());
	
	System.out.println(f.isDirectory());
		}
	}
		
	


