package day06.ex;

import javax.swing.JOptionPane;

public class BookApp {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(3);

		Book book = new Book("java", 33000);
		mgr.addbook(book);
		
		mgr.addbook(new Book("SQL",22000));
		mgr.addbook(new Book("HTML5",27000));
		
		mgr.addbook(new Book("Oracle",17000));
		mgr.printBookList();
		
		mgr.printTotalPrice();
		//검색
		String title = JOptionPane.showInputDialog("검색할 도서를 입력하세요");
		mgr.printSearchTitle(title);
	}

}
