package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            BookService service = context.getBean("serviceBean", BookService.class);

            service.displayLibraryInfo();
            service.addBook("Java Programming");
        }
    }
}
