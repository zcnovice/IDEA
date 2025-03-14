package test2.service;

import test2.entity.Books;

import java.util.List;

public interface BookService {


    List<Books> AddBook(List<Books> books,Books books1);


    List<Books> DeleteBook(List<Books> books,String nameBook);


    Books NameQueryBook(List<Books> books,String nameBook);


    public void QueryBook(List<Books> books);

}
