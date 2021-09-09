package com.ajit.BooksRecordManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Book {

	@Id
	private String id;
	
	private String title;
	private String desc;
	private String language;
	private String edition;
	private String authorId;
	private String publisherId;
	private String publishedDate;
	
	
}
