package com.ajit.BooksRecordManagement.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.BooksRecordManagement.model.Author;
import com.ajit.BooksRecordManagement.repo.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public void addBookIntoAuthorsList(String bookId, String authorId) {

		Optional<Author> author= authorRepository.findById(authorId);
		
		if(author.isPresent()) {
			
			if(author.get().getBooks() == null) {
				
				author.get().setBooks(new ArrayList<>());
			}
			
			author.get().getBooks().add(bookId);
			authorRepository.save(author.get());
		}
	}

	public String getAuthorNameById(String authorId) {
		
		Optional<Author> author= authorRepository.findById(authorId);
		
		String authorName= "";
		
		if(author.isPresent()) {
			authorName= author.get().getName();
		}
		
		return authorName;

	}
	
}
