package prob;

import prob.Book;

public class BookMgr {
	private Book[] booklist;
	private int num = 0;

	public BookMgr() {
		this.booklist = new Book[5];
	}

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	public void addBook(Book book) {
		booklist[num] = book;
		num++;
	}

	public void printBookList() {
		for (int i = 0; i < num; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println(sum);
	}
}
