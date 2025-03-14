package test2.Main;

import test2.entity.Books;
import test2.service.Impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class main {
    public static void main(String[] args) {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.randomUUID();
        UUID uuid4 = UUID.randomUUID();


        Books book1 = new Books(uuid1,"格林童话","雅各布·格林","上海交通出版社",89);
        Books book2 = new Books(uuid2,"活着","余华","上海交通出版社",37);
        Books book3 = new Books(uuid3,"流浪地球","刘慈欣","上海交通出版社",59);
        Books book4 = new Books(uuid4,"三体","刘慈欣","四川交通出版社",189);

        List<Books> books = new ArrayList<>();

        BookServiceImpl bookService = new BookServiceImpl();
        bookService.AddBook(books,book1);
    }
}
