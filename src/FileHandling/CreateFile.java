package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
	void create() {
		Path path = Paths.get("C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder\\Path.txt"); //creates Path instance
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


