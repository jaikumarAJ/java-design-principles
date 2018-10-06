package singleresponsibility.book.persistence;

import singleresponsibility.book.entity.Book;

public class BookRepository
{
    public void save(Book book)
    {
        System.out.println("Saving book : " + book.getBookName());
    }
}
