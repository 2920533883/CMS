package com.itzhang.controller;

import com.itzhang.pojo.Books;
import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.Manager;
import com.itzhang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BooksController {
    @Autowired
    BooksService booksService;

    @RequestMapping("/sellableBooks")
    public String toSellableBooksPage(){
        return "/views/booksInfo";
    }

    @RequestMapping("/checkedBooks")
    public String toCheckedBooksPage(Model model){
        List<Books> allCheckedBooks = booksService.getAllCheckedBooks();
        model.addAttribute("checkedBooks", allCheckedBooks);
        return "/views/booksCheck";
    }

    @ResponseBody
    @RequestMapping("/books/getAllSellableBooks")
    public JsonRes getAllSellableBooks(){
        List<Books> sellableBooks = booksService.getAllSellableBooks();
        return new JsonRes(0, "成功", sellableBooks);
    }

    @RequestMapping("/books/successCheck")
    public String successCheck(Integer id){
        booksService.successCheck(id);
        return "/views/booksCheck";
    }

    @RequestMapping("/books/failCheck")
    public String failCheck(Integer id){
        booksService.failCheck(id);
        return "/views/booksCheck";
    }
}
