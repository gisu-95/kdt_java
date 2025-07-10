package librarylite;
//Book 클래스
//필드 : title, author, isAvailable
//메서드 : borrow() → isAvailable 변경
//구현 조건
//책을 5권까지만 대출 가능
//책이 이미 대출 중이면 대출 불가 메시지 출력
public class Book extends Member{
	private String title;
	private String author;
	private boolean isAvailable;
	public Book(String name, String userId, String[] book, int borrowedBooks, String title, String author,
			boolean isAvailable) {
		super(name, userId, book, borrowedBooks);
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	void isAvailable(boolean isAvailable) {
		if(this.getBorrowedBooks()>0) {
			System.out.println("대출중이면 대출 불가");
		}else if(this.getBorrowedBooks()==0) {
			System.out.println("대출가능");
			this.borrowBook(null, getBorrowedBooks());
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	
	
	
	
	
}
