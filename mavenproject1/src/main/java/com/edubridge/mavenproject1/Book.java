package com.edubridge.mavenproject1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookISBN;

}
