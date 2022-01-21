public class GenreByContent extends Genre {

    public GenreByContent() {
        super("Жанр по контенту книги");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByContent genreByContent = (GenreByContent) object;

        return attribute != null && attribute.equals(genreByContent.attribute);
    }
}
