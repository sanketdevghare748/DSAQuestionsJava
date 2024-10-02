package Sanket.Oops_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) {
		Shelf sh2 = new Shelf();
		Shelf sh1 = new Shelf();

		Books book1 = new Books("first_Book", "1");
		sh1.addBook(book1);
		System.out.println(Arrays.deepToString((sh1.getAllBooksFromShelf()).toArray()));

		Books book2 = new Books("second_Book", "2");
		sh2.addBook(book2);
		// System.out.println(Arrays.deepToString((sh2.getAllBooksFromShelf()).toArray()));

		Books book3 = new Books("Third_Book", "3");
		sh2.addBook(book3);
		System.out.println(Arrays.deepToString((sh2.getAllBooksFromShelf()).toArray()));

		// sh2.removeBookFromShelf("3");
		sh2.moveBookfromShelfTo("3", sh1);
		System.out.println(Arrays.deepToString((sh1.getAllBooksFromShelf()).toArray()));

		System.out.println(Arrays.deepToString((sh2.getAllBooksFromShelf()).toArray()));
	}
}

class Shelf {

	ArrayList<String[]> list = new ArrayList<>();

	public void addBook(Books book) {
		// Create a new array each time a book is added
		String[] arr = new String[2];
		arr[0] = book.book_id;
		arr[1] = book.Bookname;
		// System.out.println(Arrays.toString(arr));
		list.add(arr);
	}

	public List<String[]> getAllBooksFromShelf() {
		return list;
	}

	public void removeBookFromShelf(String Book_id) {
		for (int i = 0; i < list.size(); i++) {
			String curBook_id = list.get(i)[0];
			if (curBook_id.equalsIgnoreCase(Book_id)) {
				list.remove(i);
				System.out.println("The Books with book id= " + curBook_id + " has beeen removed from Shelf.");
			}
		}

	}

	public void moveBookfromShelfTo(String Book_id, Shelf shTo) {
		for (int i = 0; i < list.size(); i++) {
			String curBook_id = list.get(i)[0];
			String curBook_name = list.get(i)[1];

			if (curBook_id.equalsIgnoreCase(Book_id)) {
				shTo.addBook(new Books(curBook_id, curBook_name));
				list.remove(i);

			}

		}
	}
}

class Books {
	String Bookname;
	String book_id;

	public Books(String Bookname, String book_id) {
		this.Bookname = Bookname;
		this.book_id = book_id;
	}
}
