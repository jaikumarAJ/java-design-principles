package singleresponsibility.book.entity;

public class Book
{
    private String  bookName;
    private Integer numPages;
    private String  authorName;

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public Integer getNumPages()
    {
        return numPages;
    }

    public void setNumPages(Integer numPages)
    {
        this.numPages = numPages;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }
}
