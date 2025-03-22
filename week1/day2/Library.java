package week1.day2;

public class Library {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib=new Library();
		String printStmt = lib.addBook("The Wings of Fire");
		System.out.println(printStmt);
		lib.issueBook();

	}
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
		
		
		
		
		
	}

}
