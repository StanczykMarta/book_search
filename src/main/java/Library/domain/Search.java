package Library.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class Search {
    public ArrayList<Book> avaliableBooks = new ArrayList<>();

    @Autowired
    BookRental bookRental;

      public ArrayList<Book> searchRequest() {

        System.out.print("Podaj autora lub tytul ksiazki: ");

        Scanner scanner = new Scanner(System.in);
        String zmienna = scanner.nextLine();
        scanner.close();

        for (Book iterator : bookRental.listOfBooks) {
            if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.avaliability == true) {
                avaliableBooks.add(iterator);
            } else if ((iterator.getAuthor().contentEquals(zmienna) || iterator.getTitle().contentEquals(zmienna)) && iterator.avaliability == false) {
            }
        }
        if (avaliableBooks.isEmpty()) {
            System.out.println("Szukana książka nie jest dostępna ");
        }
        return avaliableBooks;
    }
}
