package com.itzhang.service;

import com.itzhang.mapper.BooksMapper;
import com.itzhang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务接口实现类
 */
@Service("booksService")
public class BooksServiceImpl implements BooksService{
    @Autowired
    BooksMapper booksMapper;

    /**
     * 获取所有可售卖商品
     * @return List<Books>
     */
    @Override
    public List<Books> getAllSellableBooks() {
        return booksMapper.getAllSellableBooks();
    }

    /**
     * 获取所有待审核商品
     * @return List<Books>
     */
    @Override
    public List<Books> getAllCheckedBooks() {
        return booksMapper.getAllCheckedBooks();
    }

    /**
     * 更改通过审核的商品状态
     * @param id 商品id
     */
    @Override
    public void successCheck(Integer id) {
        booksMapper.successCheck(id);
    }

    /**
     * 删除未通过审核的商品
     * @param id 商品id
     */
    @Override
    public void failCheck(Integer id) {
        booksMapper.failCheck(id);
    }
}
