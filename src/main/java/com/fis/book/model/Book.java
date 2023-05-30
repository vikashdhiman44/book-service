package com.fis.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@Column(name="BOOK_ID")
	@NotNull(message="book id can't be null")
	private String bookId;
	
	@Column(name="BOOK_NAME")
	@NotBlank(message="book name can't be empty")
	private String bookName;
	
	@Column(name="AUTHOR")
	@NotBlank(message="author can't be empty")
	private String author;
	
	@Column(name="AVAILABLE_COPIES")
	@PositiveOrZero(message="available copies should be zero or positive value")
	private int availableCopies;
	
	@Column(name="TOTAL_COPIES")
	@PositiveOrZero(message="total copies should be zero or positive value")
	private int totalCopies;

	public Book(@NotNull(message = "book id can't be null") String bookId,
			@NotBlank(message = "book name can't be empty") String bookName,
			@NotBlank(message = "author can't be empty") String author,
			@PositiveOrZero(message = "available copies should be zero or positive value") int availableCopies,
			@PositiveOrZero(message = "total copies should be zero or positive value") int totalCopies) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.availableCopies = availableCopies;
		this.totalCopies = totalCopies;
	}
	
	public Book() {
		
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}
	
}
