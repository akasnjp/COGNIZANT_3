package com.library;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service=context.getBean(BookService.class);
        service.displayBookRepository();
        context.close();
    }
}