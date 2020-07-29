package com.itzhang.controller;

import com.itzhang.pojo.Books;
import com.itzhang.pojo.JsonRes;
import com.itzhang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * 商品控制类
 */
@Controller
public class BooksController {
    @Autowired
    BooksService booksService;

    /**
     * 通过访问  /sellableBooks  跳转到可卖商品页
     * @return 商品页路径
     */
    @RequestMapping("/sellableBooks")
    public String toSellableBooksPage(){
        return "/views/booksInfo";
    }

    /**
     * 通过访问 /checkedBooks  跳转到审核商品页，同时查询待审核商品，并把结果加入到Model中，返回
     * @param model
     * @return 审查页路径
     */
    @RequestMapping("/checkedBooks")
    public String toCheckedBooksPage(Model model){
        List<Books> allCheckedBooks = booksService.getAllCheckedBooks();
        model.addAttribute("checkedBooks", allCheckedBooks);
        return "/views/booksCheck";
    }

    /**
     * 通过访问  /books/getAllSellableBooks  获取所有可卖商品，返回可被Lay_ui识别的Json字符串，结合Lay_ui数据表格展示
     * @return Json字符串
     */
    @ResponseBody
    @RequestMapping("/books/getAllSellableBooks")
    public JsonRes getAllSellableBooks(){
        List<Books> sellableBooks = booksService.getAllSellableBooks();
        return new JsonRes(0, "成功", sellableBooks);
    }

    /**
     * 前台点击通过按钮，获取点击商品id，调用该方法，将商品status状态属性改为1即通过审核，并跳转到审查页
     * @param id 点击商品id
     * @return 审查页路径
     */
    @RequestMapping("/books/successCheck")
    public String successCheck(Integer id){
        booksService.successCheck(id);
        return "/views/booksCheck";
    }

    /**
     * 前台点击通过按钮，获取点击商品id，调用该方法，删除商品，并跳转到审查页
     * @param id 点击商品id
     * @return 审查页路径
     */
    @RequestMapping("/books/failCheck")
    public String failCheck(Integer id){
        booksService.failCheck(id);
        return "/views/booksCheck";
    }
}
