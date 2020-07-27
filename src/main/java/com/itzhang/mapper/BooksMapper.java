package com.itzhang.mapper;

import com.itzhang.pojo.Books;

import java.util.List;

public interface BooksMapper {
    List<Books> getAllSellableBooks();
    List<Books> getAllCheckedBooks();
    void successCheck(Integer id);
    void failCheck(Integer id);
}
