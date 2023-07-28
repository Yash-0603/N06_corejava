//program to demonstrate on access specifier
package in.bkcmet.library;

public class Library {
	//different access specifier
	public String libraryName;
	private long userID;
	String booksName;
	
	//public method
	
	public void displayPublic() 
	{
		System.out.println("Library Name:"+libraryName);
	}
	
	//private method
	
	private void displayprivate() 
	{
		System.out.println("User Id:"+ userID);
	}
	
	//default method
	
	void displaydefault() 
	{
		System.out.println("Book Name is:"+ booksName);
	}

}
