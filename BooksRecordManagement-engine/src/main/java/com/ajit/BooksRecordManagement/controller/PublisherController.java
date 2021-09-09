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

import com.ajit.BooksRecordManagement.model.Publisher;
import com.ajit.BooksRecordManagement.repo.PublisherRepository;

@RestController
@RequestMapping("/publisher")
@CrossOrigin(origins = "*")
public class PublisherController {

	@Autowired
	private PublisherRepository publisherRepository;
	
	@PostMapping("/new")
	private ResponseEntity<?> addNewPublisher(@RequestBody Publisher publisher){
		
		return new ResponseEntity<>(publisherRepository.save(publisher), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllPublishers(){
		
		return new ResponseEntity<>(publisherRepository.findAll(), HttpStatus.OK);
	}
}
