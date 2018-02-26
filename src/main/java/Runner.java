import com.krashdev.model.Book;
import com.krashdev.storage.BookStorage;
import com.krashdev.service.BooksProcessor;
import scala.collection.Iterator;

public class Runner {
    public static void main(String[] args) {
        BookStorage storage = new BookStorage();
        Iterator iter = BooksProcessor.filterByAuthor("Jack London", storage.getBooks()).iterator();
        while (iter.hasNext()) {
            Book next = (Book) iter.next();
            System.out.println(next.toString());
        }
    }
}
