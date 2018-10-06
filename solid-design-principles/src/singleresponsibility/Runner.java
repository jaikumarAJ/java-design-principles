package singleresponsibility;

import singleresponsibility.book.entity.Book;
import singleresponsibility.book.handler.BookHandler;
import singleresponsibility.book.persistence.BookRepository;
import singleresponsibility.handler.EntityHandler;

public class Runner
{
    public static void main(String[] args)
    {
        Book book = new Book();

        book.setBookName("Theory of everything.");
        book.setNumPages(124);
        book.setAuthorName("Stephen Hawking");

        BookRepository bookRepository = new BookRepository();

        bookRepository.save(book);

        EntityHandler bookHandler = new BookHandler();

        bookHandler.printEntityDetails(book);

    }
}
