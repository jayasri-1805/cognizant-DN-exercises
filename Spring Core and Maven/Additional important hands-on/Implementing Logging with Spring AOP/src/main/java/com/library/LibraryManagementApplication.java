package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication{
 public static void main(String[] args){
  ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
  BookService service=ctx.getBean(BookService.class);
  service.issueBook();
 }
}
