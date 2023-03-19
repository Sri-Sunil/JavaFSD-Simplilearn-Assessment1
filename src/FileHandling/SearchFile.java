package FileHandling;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class SearchFile {
   void search() {
      Scanner sc = new Scanner(System.in);
      String pathStr = "C:\\Users\\HP\\eclipse-workspace\\com.simplilearn.assessment1\\TextFolder";        
      System.out.println("Enter the desired file name: ");
      String file = sc.next();
      System.out.println(file);      
      File dir = new File(pathStr);
      String[] list = dir.list();
      System.out.println(Arrays.toString(list));
      boolean flag = false;      
      for (int i = 0; i < list.length; i++) {
         if(file.equals(list[i])){
            flag = true;
         }
      }        
      if(flag){
         System.out.println("File Found");
      }else{
         System.out.println("File Not Found");
      }
}}