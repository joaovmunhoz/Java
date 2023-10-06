import java.util.Objects;

public class Book {//inicializando objeto
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){// inicializando com parametros
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){//implementando o metodo toString
        return "Book\nTitle: "+this.title+
                "\nAuthor: "+this.author+
                "\nYear: "+this.year;
    }

    @Override
    public boolean equals(Object o) {// implementando o metodo equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {// implementando  metodo hashCode
        return Objects.hash(title, author, year);
    }
}
