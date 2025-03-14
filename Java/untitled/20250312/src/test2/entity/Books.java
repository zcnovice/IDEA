package test2.entity;

import java.util.UUID;

public class Books {
    private UUID UUID;
    private String BookName;
    private String author;
    private String publishingHouse;
    private int price;

    public Books() {
    }

    public Books(UUID UUID, String bookName, String author, String publishingHouse, int price) {
        this.UUID = UUID;
        BookName = bookName;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.price = price;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "UUID='" + UUID + '\'' +
                ", BookName='" + BookName + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", price=" + price +
                '}';
    }
}
