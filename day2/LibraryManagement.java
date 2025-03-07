package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib=new Library();
		String printStmt = lib.addBook("Atomic Habits");
		System.out.println(printStmt);
		lib.issueBook();


	}

}
