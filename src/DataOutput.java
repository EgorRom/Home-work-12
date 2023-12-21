public class DataOutput {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил Булгаков");
        Book book = new Book(bulgakov, " Мастер и Маргарита ", 2015);
        book.setPublishingYear(2018);
        System.out.println(bulgakov.getName() + " " + book.getBookName() + book.getPublishingYear());
        Author tolstoy = new Author("Лев Толстой");
        Book book1 = new Book(tolstoy, "Анна Каренина ", 1950);
        book1.setPublishingYear(2002);
        System.out.println(tolstoy.getName() + " " + book1.getBookName() + " " + book1.getPublishingYear());
    }

}
