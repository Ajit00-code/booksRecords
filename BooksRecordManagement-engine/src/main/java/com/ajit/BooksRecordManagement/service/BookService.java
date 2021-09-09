package com.ajit.BooksRecordManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.BooksRecordManagement.model.Book;
import com.ajit.BooksRecordManagement.repo.BooksRepository;
import com.ajit.BooksRecordManagement.repo.PublisherRepository;

@Service
public class BookService {

	@Autowired
	private BooksRepository bookRepository; 
	
	@Autowired
	private AuthorService authorService; 
	
	@Autowired
	private PublisherService publisherService; 
	
	public Book addNewBook(Book book) {
		
		Book savedBook= bookRepository.save(book);
		
		publisherService.addBookIntoPublishersList(savedBook.getId(), savedBook.getPublisherId());
		
		authorService.addBookIntoAuthorsList(savedBook.getId(), savedBook.getAuthorId());
		
		
		return savedBook;
	}
	
	public List<Book> addAuthorAndPublishersName(List<Book> booksList){
		
		for(Book book: booksList) {
			String authorName= authorService.getAuthorNameById(book.getAuthorId());
			String publisherName= publisherService.getPublisherNameById(book.getPublisherId());
			book.setAuthorId(authorName);
			book.setPublisherId(publisherName);
		}
		
		return booksList;
	}
}
