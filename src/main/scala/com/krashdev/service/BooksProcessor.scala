package com.krashdev.service

import java.util

import scala.collection.JavaConverters._
import com.krashdev.model.Book

import scala.collection.mutable.ListBuffer

object BooksProcessor {
  def filterByAuthor(author: String)(implicit books: util.ArrayList[Book]): List[Book] = {
    val scalaBooks = ListBuffer[Book]()
    asScalaIterator(books.iterator).foreach(book => {
      if (book.author == author) {
        scalaBooks += book
      }
    })
    scalaBooks.toList
  }
}
