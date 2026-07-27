package com.library.service;
import org.springframework.stereotype.Service;
@Service
public class BookService{
 public void issueBook(){
   System.out.println("Book issued successfully.");
   try{Thread.sleep(100);}catch(Exception e){}
 }
}
