package com.itzhang.service;

import com.itzhang.mapper.BooksMapper;
import com.itzhang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service("booksService")
public class BooksServiceImpl implements BooksService{
    @Autowired
    BooksMapper booksMapper;


    @Override
    public List<Books> getAllSellableBooks() {
        return booksMapper.getAllSellableBooks();
    }

    @Override
    public List<Books> getAllCheckedBooks() {
        return booksMapper.getAllCheckedBooks();
    }

    @Override
    public void successCheck(Integer id) {
        booksMapper.successCheck(id);
    }

    @Override
    public void failCheck(Integer id) {
        booksMapper.failCheck(id);
    }
}
