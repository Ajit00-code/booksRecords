package com.ajit.BooksRecordManagement.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Publisher {

	@Id
	private String id;
	
	private String name;
	private String location;
	private List<String> publications;
	
	
	
}
