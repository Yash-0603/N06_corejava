//program to demonstrate on access specifier
//driver class

package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		/* userID and displayPrivate() method is private,so 
		 * we can't access into another package or class,only 
		 * we can access inside the same class */ 
		
		//l.userID=1234456
		//l.displayPrivate();
		
		/*booksName and displayDefault() method is default,
		 * we can't access into another package,only we can
		 * access in within the same package */
		
		//l.booksName;
		//l.displayDefault();
		 
	}

}
