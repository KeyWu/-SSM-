package com.Jiang.service;
import com.Jiang.pojo.Book;
import java.util.List;
import java.util.Map;

public interface BookService {
    //1.查找书籍
    List<Book> QueryBooks(Map map);
    //2.增加一本书
    int AddBook(Book book);
    //3.删除一本书
    int DeleteBook(Map map);
    //4.修改一本书
    int UpdataBook(Book book);
}
