import java.util.Locale;
import java.util.Objects;

public class Author {
    private String author;

    public Author(String author) {
        this.author = author.toUpperCase();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(author, author1.author);
    }

    public int hashCode() {
        return Objects.hash(author);
    }

    public String getName() {
        return this.author;
    }

    public String toString() {
        return author;
    }
}
