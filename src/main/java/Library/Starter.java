package Library;

import Library.domain.Book;
import Library.domain.BookRental;
import Library.domain.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    BookRental bookRental;
    @Autowired
    Search search;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookRental);
        System.out.println(search.searchRequest());
        }
    }


