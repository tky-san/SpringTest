package book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
