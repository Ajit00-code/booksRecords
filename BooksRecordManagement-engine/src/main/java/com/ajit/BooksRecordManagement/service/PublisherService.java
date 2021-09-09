package com.ajit.BooksRecordManagement.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.BooksRecordManagement.model.Author;
import com.ajit.BooksRecordManagement.model.Publisher;
import com.ajit.BooksRecordManagement.repo.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	private PublisherRepository publisherRepository;
	
	
	public void addBookIntoPublishersList(String bookId, String publisherId) {

		Optional<Publisher> publisher= publisherRepository.findById(publisherId);
		
		if(publisher.isPresent()) {
			
			if(publisher.get().getPublications() == null) {
				
				publisher.get().setPublications(new ArrayList<>());
			}
			
			publisher.get().getPublications().add(bookId);
			
			publisherRepository.save(publisher.get());
		}
	}

public String getPublisherNameById(String publisherId) {
		
		Optional<Publisher> publisher= publisherRepository.findById(publisherId);
		
		String publisherName= "";
		
		if(publisher.isPresent()) {
			publisherName= publisher.get().getName();
		}
		
		return publisherName;

	}
	
}
