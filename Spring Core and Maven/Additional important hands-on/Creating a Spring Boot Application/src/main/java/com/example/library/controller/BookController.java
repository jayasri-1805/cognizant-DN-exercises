package com.example.library.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController{
@Autowired
private BookRepository repository;

@GetMapping
public List<Book> getAll(){ return repository.findAll(); }

@PostMapping
public Book add(@RequestBody Book book){ return repository.save(book); }

@GetMapping("/{id}")
public Book get(@PathVariable Long id){ return repository.findById(id).orElse(null); }

@PutMapping("/{id}")
public Book update(@PathVariable Long id,@RequestBody Book b){
b.setId(id);
return repository.save(b);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){ repository.deleteById(id); }
}
