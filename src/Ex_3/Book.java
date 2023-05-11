//Створити клас Book, зробити 3 поля та відповідні методи. Необхідно реалізувати замикання анонімного класу та лямбда-виразу.

package Ex_3;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public static void main(String[] args) {
        final BookFilter filter = new BookFilter() {
            public void filter(Book book) {
                System.out.println("Title of the book is: " + book.title);
            }
        };
        BookFilter lambdaFilterAuthor = (book) -> {
            System.out.println("Author of the book is: " + book.author);
        };

        Book firstBook = new Book("Tom Soyer", "Mark Twen", 1876);

        filter.filter(firstBook);
        lambdaFilterAuthor.filter(firstBook);
    }
}