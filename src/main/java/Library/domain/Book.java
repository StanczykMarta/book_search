package Library.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Book {

    public String author;

    public String title;

    public boolean avaliability;

    public Book(String author) {
        this.author = author;
    }

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }

    public Book(String author, String title, boolean avaliability) {
        this.author = author;
        this.title = title;
        this.avaliability = avaliability;
    }

    public Book() {

    }

//    @Override
//    public String toString() {
//        return "NEW BOOK: " + author + " '" + title + "' DOSTĘPNOŚĆ: " + avaliability + "\n";
//    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", avaliability=" + avaliability +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvaliability() {
        return avaliability;
    }

    public void setAvaliability(boolean avaliability) {
        this.avaliability = avaliability;
    }
}
