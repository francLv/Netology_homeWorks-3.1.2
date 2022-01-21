public class GenreByNumberOfPages extends Genre {

    public GenreByNumberOfPages() {
        super("Жанр по объёму книги");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByNumberOfPages genreByNumberOfPages = (GenreByNumberOfPages) object;

        return attribute != null && attribute.equals(genreByNumberOfPages.attribute);
    }
}
