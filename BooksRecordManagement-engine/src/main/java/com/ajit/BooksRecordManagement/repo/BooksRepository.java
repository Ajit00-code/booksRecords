package com.ajit.BooksRecordManagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ajit.BooksRecordManagement.model.Book;

public interface BooksRepository extends MongoRepository<Book, String>{

}
