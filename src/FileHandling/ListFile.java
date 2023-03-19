package FileHandling;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class ListFile {
	void display() {
		Scanner sc = new Scanner(System.in);
		String pathStr = "C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder";             
	    File dir = new File(pathStr);
	    String[] list = dir.list();
	    for(int i=0;i<list.length;i++){
	        System.out.println(list[i]);
}}}