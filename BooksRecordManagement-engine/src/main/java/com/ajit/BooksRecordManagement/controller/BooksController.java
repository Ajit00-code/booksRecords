package com.ajit.BooksRecordManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.BooksRecordManagement.model.Book;
import com.ajit.BooksRecordManagement.repo.BooksRepository;
import com.ajit.BooksRecordManagement.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")

public class BooksController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BooksRepository booksRepository;
	
	@PostMapping("/new")
	public ResponseEntity<?> addNewBook(@RequestBody Book book){
		
		return new ResponseEntity<>(bookService.addNewBook(book), HttpStatus.OK);
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllBooks(){
		
		List<Book> books= booksRepository.findAll();
		
		return new ResponseEntity<>(bookService.addAuthorAndPublishersName(books), HttpStatus.OK);
	}
	
	@GetMapping("/all/page/{number}/size/{size}")
	public ResponseEntity<?> getAllBooksWithPagination(@PathVariable("number")int number, @PathVariable("size")int size ){
		
		Pageable paging = PageRequest.of(number, size);
		
		
		return new ResponseEntity<>(booksRepository.findAll(paging), HttpStatus.OK);
	}
}
