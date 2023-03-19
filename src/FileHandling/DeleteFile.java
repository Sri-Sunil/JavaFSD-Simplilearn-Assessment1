package FileHandling;

import java.io.File;

public class DeleteFile {

	void delete() {
		try  
		{  
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder\\stack.txt");  
		file.deleteOnExit();  
		System.out.println("File deleted successfully!!!");  
		Thread.sleep(1000);    
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}
}}
