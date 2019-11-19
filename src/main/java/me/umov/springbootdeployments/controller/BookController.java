package me.umov.springbootdeployments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.umov.springbootdeployments.model.Book;
import me.umov.springbootdeployments.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository repository;

	@GetMapping
	public List<Book> list() {
		return repository.list();
	}

	@PostMapping
	public Book create(@RequestBody Book newBook) {
		repository.create(newBook);
		return newBook;
	}

	@GetMapping("/{id}")
	public Book get(@PathVariable Long id) {
		return repository.findById(id);
	}

}
