package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
	
public class MainClass {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ListFile list = new ListFile();
		Perform p = new Perform();
		System.out.println("LockedMe.com Application - A Company Lockers Product \nDeveloper: Sunil Srikanth Full Stack developer in Company Lockers Pvt. Ltd.");
		System.out.println();
		System.out.println("Select an option---");
		try{
			System.out.println("1. Print files in the directory (Type '1') \n2. Add/Delete/Search a file in the directory--- (Type '2') \n3. Close the application (Type '3')");
			int option = sc.nextInt();
			
			switch(option){
			case 1 : list.display(); break;
			case 2 : System.out.println("Select an option to perform (Add(1)/Delete(2)/Search(3)/Return To Main Menu(4))----");
			int input = sc.nextInt();
			p.perform(input);			
			break;
			case 3 : System.out.println("Closing the application"); System.exit(0);
			}			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
