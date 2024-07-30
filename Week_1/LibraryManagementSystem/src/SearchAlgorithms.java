import java.util.Arrays;

public class SearchAlgorithms {
     public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = books[mid].getTitle().compareTo(title);

            if (compareResult == 0) {
                return books[mid];
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("1", "Effective Java", "Joshua Bloch"),
            new Book("2", "Java Concurrency in Practice", "Brian Goetz"),
            new Book("3", "Clean Code", "Robert C. Martin")
        };

        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        System.out.println("Linear Search:");
        Book result1 = linearSearch(books, "Clean Code");
        System.out.println(result1 != null ? result1 : "Book not found");

        
        System.out.println("\nBinary Search:");
        Book result2 = binarySearch(books, "Clean Code");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
