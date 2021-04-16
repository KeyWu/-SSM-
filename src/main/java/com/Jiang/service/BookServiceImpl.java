package com.Jiang.service;

import com.Jiang.dao.Book.BookMapper;
import com.Jiang.pojo.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> QueryBooks(Map map) {
        return bookMapper.QueryBooks(map);
    }

    @Override
    public int AddBook(Book book) {
        return bookMapper.AddBook(book);
    }

    @Override
    public int DeleteBook(Map map) {
        return bookMapper.DeleteBook(map);
    }

    @Override
    public int UpdataBook(Book book) {
        return bookMapper.UpdataBook(book);
    }



}
