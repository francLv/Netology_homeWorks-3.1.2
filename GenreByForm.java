public class GenreByForm extends Genre {

    public GenreByForm() {
        super("Жанр по формату книги");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByForm genreByForm = (GenreByForm) object;

        return attribute != null && attribute.equals(genreByForm.attribute);
    }
}

