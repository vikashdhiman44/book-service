package com.fis.book.controller;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.book.exception.NoDataFoundException;
import com.fis.book.model.Book;
import com.fis.book.service.BookService;

@RestController
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		HttpStatus status = HttpStatus.OK;
		List<Book> books = null;
		try {
			books = bookService.getAllBooks();
			return new ResponseEntity<>(books, status); 
		} catch (NoDataFoundException ex) {
			status = HttpStatus.NOT_FOUND;
			return new ResponseEntity<>(books, status);
		}
	}
}
