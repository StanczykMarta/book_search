package Library.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRental {

    public ArrayList<Book> listOfBooks = new ArrayList<>();

    public Book book;


    public ArrayList<Book> addBooks() {
        listOfBooks.add(new Book("Adam Mickiewicz", "Dziady cz2", true));
        listOfBooks.add(new Book("Adam Mickiewicz", "Pan Tadeusz", true));
        listOfBooks.add(new Book("Adam Mickiewicz", "Dziady cz3", false));
        listOfBooks.add(new Book("Henryk Sienkiewicz", "Quo Vadis", true));
        listOfBooks.add(new Book("Henryk Sienkiewicz", "W pustyni i puszczy", false));
        listOfBooks.add(new Book("Gombrowicz", "Ferdydurke", false));
        listOfBooks.add(new Book("Jan Kochanowski", "Na zdrowie", false));

        return listOfBooks;
    }

    public BookRental(Book book){
        this.book=book;
    }
    @Override
    public String toString() {
        return
                "Ksiązki do wypożyczenia :  " + "\n" + addBooks() + "\n";
    }
}
