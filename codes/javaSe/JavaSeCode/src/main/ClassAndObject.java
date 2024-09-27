package main;

public class ClassAndObject {
    public static void main(String[] args) {
        class Book {
            int id;
            String name;
            String author;
            int pageCount;
            String description;
        }

        Book book1 = new Book();
        Book book2 = new Book();

        book1.id = 1;
        book1.name = "Java Programming";
        book1.author = "John Doe";
        book1.pageCount = 500;
        book1.description = "A guide to Java programming";

        book2.id = 2;
        book2.name = "Data Structures";
        book2.author = "Jane Smith";
        book2.pageCount = 300;
        book2.description = "A detailed introduction to data structures";

        System.out.println("Book 1:");
        System.out.println("ID: " + book1.id);
        System.out.println("Name: " + book1.name);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);
        System.out.println("Description: " + book1.description);

        System.out.println("\nBook 2:");
        System.out.println("ID: " + book2.id);
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Page Count: " + book2.pageCount);
        System.out.println("Description: " + book2.description);
    }
}
