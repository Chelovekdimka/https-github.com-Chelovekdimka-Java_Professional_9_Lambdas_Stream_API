//Створити клас Book, зробити 3 поля та відповідні методи. Необхідно реалізувати замикання анонімного класу та лямбда-виразу.

package Ex_3_1;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int currentPage;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.currentPage = 1;
    }

    public void read() {
        System.out.println("Reading " + this.title + " by " + this.author);

        // Замикання анонімного класу для виконання коду після кінця читання книги
        Runnable onFinishReading = new Runnable() {
            @Override
            public void run() {
                System.out.println("Finished reading " + title);
            }
        };

        while (this.currentPage <= this.pages) {
            System.out.println("Reading page " + this.currentPage);
            this.currentPage++;
        }

        // Виклик методу run() замикання після завершення читання книги
        onFinishReading.run();
    }

    public void bookmark(int page) {
        // Лямбда-вираз для створення об'єкту замикання з функціональним інтерфейсом
        Runnable onBookmark = () -> {
            System.out.println("Bookmarked page " + page + " of " + title);
        };

        this.currentPage = page;
        onBookmark.run();
    }

    public void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }

    public static void main(String[] args) {
        Book firstBook = new Book("Tom Soyer", "Mark Twen", 366);
        firstBook.read();
        firstBook.bookmark(8);
        firstBook.printInfo();
    }
}