
/*
Create a library Management system which is capable of issuing books to the students.
books should have info like :
1. book name
2. book author
3. issued to
4. issued on
user should be able to add books, return issued books, issue books
Assume that all the user are registered with their name in the central database
 */

//import org.graalvm.compiler.replacements.ConstantBindingParameterPlugin;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
        System.out.println("You Book has been added successfully");
    }

    public void returnBook(Book b){
        this.books.add(b);
        System.out.println("The Returned successfully!!!");
    }
    public void issueBook(Book book, String issued_to){
        this.books.remove(book);
        System.out.println("Book Issued successfully to "+issued_to);
    }
}

public class ex_7_sol {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Digital Electronic", "Rinix");
        bk.add(b1);

        Book b2 = new Book("HTML", "Clur");
        bk.add(b2);

        Book b3 = new Book("CSS", "Narendra");
        bk.add(b3);

        Book b4 = new Book("Radar", "Sonveer");
        bk.add(b4);

        Book b5 = new Book("DataBase", "Saikha");
        bk.add(b5);

        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("Algo","CTSK"));
        System.out.println(l.books);
        l.issueBook(b1,"Hemant");
        System.out.println(l.books);


    }
}
