package com.itzhang.mapper;

import com.itzhang.pojo.Books;
import java.util.List;

/**
 * 货物Mapper
 */
public interface BooksMapper {

    // 获取所有可售卖的货物
    List<Books> getAllSellableBooks();
    // 获取所有待审核货物
    List<Books> getAllCheckedBooks();
    // 审核通过，更改货物状态
    void successCheck(Integer id);
    // 审核不通过，直接删除
    void failCheck(Integer id);
}
