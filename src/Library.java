public class Library {
        public static void main(String[] args) {
            final String appName = "Biblioteka v0.2";

            Book book1 = new Book();
            book1.title = "Java w 21 dni";
            book1.author = "Rogers Cadenhead";
            book1.realeseDate = 2016;
            book1.pages = 600;
            book1.publisher = "Helion";
            book1.isbn = "9788328326217";

            System.out.println(appName);
            System.out.println("Książki dostępne w bibliotece");
            System.out.println(book1.title);
            System.out.println(book1.author);
            System.out.println(book1.realeseDate);
            System.out.println(book1.pages);
            System.out.println(book1.publisher);
            System.out.println(book1.isbn);
        }
    }

