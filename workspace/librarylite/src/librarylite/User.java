package librarylite;

import java.util.Scanner;

//기수 - 도서 대출 시스템 (LibraryLite)
//요구사항
//User 클래스
//필드 : name, userId
//메서드 : login()
//Member (User 상속)
//필드 : Book[] borrowedBooks (최대 5권)
//메서드 : borrowBook(Book book)
//Book 클래스
//필드 : title, author, isAvailable
//메서드 : borrow() → isAvailable 변경
//구현 조건
//책을 5권까지만 대출 가능
//책이 이미 대출 중이면 대출 불가 메시지 출력
public class User {
	public static void main(String[] args) {
		
	
	}
	private String name;
	private String userId;
	public User(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	void login() {
		this.userId = "admin";
			System.out.print(this.userId + "님 반갑습니다.");
		}
	}
	

