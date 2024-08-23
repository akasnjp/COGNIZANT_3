package com.example.bookstoreapi.controller;
import java.util.List;
@RestController
@RequestMapping("/api/books")
public class BookController {
 @GetMapping
 public List<Book> getBooks() {
 // This is just a placeholder. In a real application, you'd fetch data from a database.
 return List.of(
 new Book(null, null, null),
 new Book(null, null, null)
 );
 }
}