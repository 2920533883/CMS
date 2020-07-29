package com.itzhang.service;

import com.itzhang.pojo.Books;
import java.util.List;

/**
 * 商品服务接口
 */
public interface BooksService {
    List<Books> getAllSellableBooks();
    List<Books> getAllCheckedBooks();
    void successCheck(Integer id);
    void failCheck(Integer id);
}
