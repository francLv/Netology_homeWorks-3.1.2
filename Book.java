public class Book {
    private String title;
    private Genre[] genres;

    public Book(String title, Genre[] genres) {
        this.title = title;
        this.genres = genres;
    }

    //for creating new book
    public Book(String title) {
        this.title = title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title;
    }


}
