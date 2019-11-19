package me.umov.springbootdeployments.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import me.umov.springbootdeployments.model.Book;

@ApplicationScope
@Component
public class BookRepository {

	private static List<Book> books = new ArrayList<>();

	static {
		books.add(new Book(1L, "A volta dos que não foram", "Fulano de Souza"));
		books.add(new Book(2L, "Como falar dos livros que não lemos", "Beltrano da Silva"));
		books.add(new Book(3L, "O homem que odiava segunda-feira", "Ciclano de Oliveira"));
	}

	public void create(Book book) {
		book.setId(nextId());
		books.add(book);
	}

	public List<Book> list() {
		return books;
	}

	public Book findById(Long id) {
		return books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
	}

	private Long nextId() {
		return Long.valueOf(books.size() + 1);
	}

}
