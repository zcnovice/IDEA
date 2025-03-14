package test2.service.Impl;

import test2.entity.Books;
import test2.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public List<Books> AddBook(List<Books> books, Books books1) {
        books.add(books1);

        return books;
    }

    @Override
    public List<Books> DeleteBook(List<Books> books, String nameBook) {
        Books deleteBookName = NameQueryBook(books,nameBook);

        books.remove(deleteBookName);
        return books;
    }

    @Override
    public Books NameQueryBook(List<Books> books,String nameBook) {
        for(int i = 0;i < books.size();i++)
        {
            if(books.get(i).getBookName().equals(nameBook))
            {
                return  books.get(i);
            }
        }
        return null;
    }

    public void QueryBook(List<Books> books)
    {

    }
}
