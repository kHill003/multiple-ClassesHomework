public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
      this.title = title;
      this.author = author;
      this.genre = genre;

    }
public String GetTitle(){
        return title;
}

public String getAuthor() {
        return author;
    }
public String getGenre() {
    return genre;
}
public String setTitle(){
        this.title = title;
        return title;
}
public String setAuthor(){
        this.author = author;
        return author;
}
public String setGenre(){
        this.genre = genre;
        return genre;
}
}


