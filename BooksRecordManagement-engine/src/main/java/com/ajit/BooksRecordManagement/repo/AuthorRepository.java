package com.ajit.BooksRecordManagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ajit.BooksRecordManagement.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String>{

}
