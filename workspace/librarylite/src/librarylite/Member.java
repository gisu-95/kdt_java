package librarylite;

import java.util.Scanner;

//Member (User 상속)
//필드 : Book[] borrowedBooks (최대 5권)
//메서드 : borrowBook(Book book)
public class Member extends User{
	private String[] book;
	private int borrowedBooks;
	public Member(String name, String userId, String[] book, int borrowedBooks) {
		super(name, userId);
		this.book = book;
		this.borrowedBooks = borrowedBooks;
	}
	public String[] getBook() {
		return book;
	}
	public void setBook(String[] book) {
		this.book = book;
	}
	public int getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(int borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	void borrowBook( int[] book, int borrowedBooks ) {
		Scanner sc = new Scanner(System.in);
		this.book = new String [5];
		System.out.println("몇권의 책을 빌리시겠습니까");
		this.borrowedBooks = sc.nextInt();
		if(this.borrowedBooks>6) {
			System.out.println("한번에 빌릴 수 있는 책은 최대 5권입니다");
		}else if(this.borrowedBooks>0 && this.borrowedBooks<=5) {
			for(int i=0;i<this.borrowedBooks;i++) {
				System.out.print("빌리고 싶은 책 제목 입력하세요 : ");
				this.book[i] = sc.next();
			}
		}else if(this.borrowedBooks == 0) {
			System.out.println("안녕히가세요");
		}else {
			System.out.println("잘못된 입력입니다");
		}
		
		
			
			
		
	}
	
}
