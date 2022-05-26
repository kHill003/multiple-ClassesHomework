import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();

    }
    public int getCapacity(){
        return capacity;
    }
    public int getNumOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {

            this.books.add(book);
    }
    public boolean hasCapacity(){
        return capacity >this.books.size();
    }
}


