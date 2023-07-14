package org.example.iocxml.di;

public class Book {

    private String bname;
    private String author;
    private String others;

    public Book() {
        System.out.println("无参构造执行了...");
    }

    //有参构造方法
    public Book(String bname, String author) {
        System.out.println("有参构造执行了...");
        this.bname = bname;
        this.author = author;
    }

    //生成set方法
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("jiajia929");

        //通过构造器注入
        Book book1 = new Book("c++","jiajia929");
    }
}
