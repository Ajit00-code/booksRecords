package com.ajit.BooksRecordManagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ajit.BooksRecordManagement.model.Publisher;

public interface PublisherRepository extends MongoRepository<Publisher, String> {

}
