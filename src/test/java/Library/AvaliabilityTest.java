package Library;

import Library.domain.Book;
import Library.domain.BookRental;
import Library.domain.Search;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.security.BasicPermission;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliabilityTest {


    @Test
    public void czyKsiązkaGombrowiczaJestDostęna(){
        Book book = new Book("Gombrowicz", "Ferdydurke", false);
            String excpectedValue ="Book{author='Gombrowicz', title='Ferdydurke', avaliability=false}";
            assertEquals( excpectedValue, book.toString());
    }

    @Test
    public void czyKsiązkaMickiewiczaJestDostępna(){
        Book book = new Book("Adam Mickiewicz", "Dziady cz2", true);
        String excpectedValue ="Book{author='Adam Mickiewicz', title='Dziady cz2', avaliability=true}";
        assertEquals( excpectedValue, book.toString());

    }
}
