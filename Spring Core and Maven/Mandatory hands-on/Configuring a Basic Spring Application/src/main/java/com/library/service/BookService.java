package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Setter used by Spring XML
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayLibraryInfo() {
        Book book = repository.getSampleBook();

        System.out.println("===== Library Management =====");
        System.out.println("Sample Book : " + book.getTitle());
        System.out.println("Spring bean configuration loaded successfully.");
    }

    public void addBook(String name){
        System.out.println("Book added: " + name);
    }
}
