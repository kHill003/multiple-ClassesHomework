import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book;
    Book book1;
    Book book2;
    Book book3;

    Library library;

    @Before
    public void Setup()  {
        book = new Book("Dogs On Mars", "Rover", "Science Fiction");
        book1 = new Book("Tasty Meals for Dogs", "Jamie Woof", "Cooking");
        book2 = new Book("First Dog on the Moon", "Sunny Boy", "Science Fiction");
        book3 = new Book("Bark Like You Mean It", "Miss Moo", "Self Improvement");
        library = new Library(20);
    }
    @Test
    public void LibStartsEmpty(){
      assertEquals(0,library.getNumOfBooks());
    }
    public void CanAddBooks(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(4, library.getNumOfBooks());

    }
    @Test
    public void canReportCapacity() {
        assertEquals(true, library.hasCapacity());
    }
}