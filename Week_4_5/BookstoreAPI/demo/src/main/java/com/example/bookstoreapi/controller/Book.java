package com.example.bookstoreapi.controller;
@Getter
@Setter
@ToString
public class Book {
 private Long id;
 private String title;
 private String author;
 public Book(Long id, String title, String author) {
 this.id = id;
 this.title = title;
 this.author = author;
 }
}