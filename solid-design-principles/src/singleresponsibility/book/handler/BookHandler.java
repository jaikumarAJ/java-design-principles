package singleresponsibility.book.handler;

import singleresponsibility.book.entity.Book;
import singleresponsibility.handler.EntityHandler;

public class BookHandler implements EntityHandler
{

    @Override
    public void printEntityDetails(Object entity)
    {
        System.out.println("Book name : " + ((Book) entity).getBookName());
        System.out.println("No. of pages  : " + ((Book) entity).getNumPages());
        System.out.println("Book author : " + ((Book) entity).getAuthorName());
    }
}
