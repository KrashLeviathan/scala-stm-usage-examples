import java.util

import com.krashdev.model.Book
import com.krashdev.service.BooksProcessor
import com.krashdev.storage.BookStorage

object ScalaRunner extends App {
  implicit val books: util.ArrayList[Book] = new BookStorage().getBooks
  BooksProcessor.filterByAuthor("Jack London").foreach(b => println(b))
}
