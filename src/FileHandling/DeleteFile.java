package FileHandling;

import java.io.File;

public class DeleteFile {

	void delete() {
		try  
		{  
		String filePath =  "C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder\\";
			System.out.println("Enter your file name to delete: ");
			Scanner sc = new Scanner(System.in);
			String fname= sc.next();
			filePath = filePath+fname;	
			
			File file = new File(filePath);  
			file.deleteOnExit();  
			System.out.println("File deleted successfully!!!");  
			Thread.sleep(1000);    
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}
}}
