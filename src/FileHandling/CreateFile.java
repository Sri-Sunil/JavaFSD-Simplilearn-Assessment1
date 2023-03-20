package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
	void create() {
		String filePath =  "C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder\\";
		System.out.println("Enter your file name: ");
		Scanner sc = new Scanner(System.in);
		String fname= sc.next();
		filePath = filePath+fname;
		
		Path path = Paths.get(filePath);
		{
		try   
		{  
		Path p= Files.createFile(path);  
		System.out.println("File Created at Path: "+p);  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}
}}}


