package FileHandling;

public class Perform {	
	void perform(int a) {
		int p = a;	
		CreateFile create = new CreateFile();
		DeleteFile delete = new DeleteFile();
		SearchFile search = new SearchFile();
		
		switch(p) {
		case 1 : create.create(); break;
		case 2 : delete.delete(); break;
		case 3 : search.search(); break;
		case 4 : MainClass.main(null);
}}}
