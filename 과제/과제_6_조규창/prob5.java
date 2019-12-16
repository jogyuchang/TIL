package prob;

import prob.Book;
import prob.BookMgr;

public class prob5 {
	public static void main(String[] args) {
	BookMgr bookMgr = new BookMgr();
		
	bookMgr.addBook(new Book("Java Program", 26400));
	bookMgr.addBook(new Book("JSP Program", 26400));
	bookMgr.addBook(new Book("SQL Fundamentals", 26400));
	bookMgr.addBook(new Book("JDBC Program", 26400));
	bookMgr.addBook(new Book("EJB Program", 26400));
		
		System.out.println("=== 책 목록 ===");
		bookMgr.printBookList();
		System.out.println();
		
		System.out.println("=== 책 가격의 총합 ===");
		bookMgr.printTotalPrice();
	}

}
/*문제 . 아래의 조건을 참조하여 Book, BookMgr 클래스를 구현하시오.  
 * Book 클래스의 제약조건
1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
2. 멤버변수는 모두 private 접근제한자를 가져야 한다. 
3. 멤버변수를 모두 초기화하는 생성자 메서드가 있어야 한다. 
기본 생성자 메서드가 있어야 한다. 
4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
	setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
	String getTitle() : 멤버변수 title 값을 반환하는 메소드
	void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
	int getPrice() : 멤버변수 price 값을 반환하는 메소드 
5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다. 

BookMgr 클래스의 제약조건 
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

[Prob4 실행결과]
=== 책 목록 ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== 책 가격의 총합 ===
전체 책 가격의 합 : 132000

 */