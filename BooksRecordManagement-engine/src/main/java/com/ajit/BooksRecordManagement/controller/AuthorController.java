package com.ajit.BooksRecordManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.BooksRecordManagement.model.Author;
import com.ajit.BooksRecordManagement.repo.AuthorRepository;

@RestController
@RequestMapping("/author")
@CrossOrigin(origins = "*")

public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;
	
	@PostMapping("/new")
	public ResponseEntity<?> addNewAuthor(@RequestBody Author author){
		
		return new ResponseEntity<>(authorRepository.save(author), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllAuthors(){
		
		return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<?> testMethod(){
		
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
}
