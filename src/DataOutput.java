import java.util.Arrays;

public class DataOutput {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил Булгаков");
        Book book = new Book(bulgakov, " Мастер и Маргарита ", 2015);
        book.setPublishingYear(2018);
        System.out.println(book);
        Author tolstoy = new Author("Лев Толстой");
        Book book1 = new Book(tolstoy, "Анна Каренина ", 2015);
        book1.setPublishingYear(2002);
        System.out.println(book1);
        Author pushkin = new Author("А.С Пушкин");
        Book book3 = new Book(pushkin, "Евгений Онегин", 1831);
        System.out.println(book3);
        Author mihail = new Author("Михаил Булгаков");
        Book book4 = new Book(mihail, "Собачье сердце ", 1925);
        System.out.println(book4);
        Book book5 = new Book(bulgakov, " Мастер и Маргарита ", 2018);
        System.out.println(bulgakov.equals(mihail));
        System.out.println(book.equals(book5));



    }


}
