package com.itzhang.controller;

import com.itzhang.pojo.Tag;
import com.itzhang.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * 分类控制类
 */
@Controller
public class TagController {

    @Autowired
    TagService tagService;

    /**
     * 根据前端按钮点击传来的父分类id来获取对应子分类，并跳转到分类管理页
     * @param parent_id 父分类id
     * @param model 数据模型
     * @return 分类管理页资源路径
     */
    @RequestMapping("/tag")
    public String toTagPage(Integer parent_id, Model model){
        List<Tag> allParentTag = tagService.getAllParentTag();
        model.addAttribute("ParentTags", allParentTag);
        List<Tag> childTag = tagService.getChildTagByParent(parent_id);
        model.addAttribute("ChildTags", childTag);
        return "views/tagInfo";
    }

    /**
     * 点击前端删除按钮 访问 /deleteTag 请求，根据id删除分类
     * 同时重定向访问 /tag?parent_id (被删除分类的父分类id)，获取该父分类下剩余子分类
     * @param id 被删分类id
     * @param parent_id 父分类id
     * @return 重定向访问 redirect:/tag?parent_id 资源
     */
    @RequestMapping("/tag/deleteTag")
    public String deleteTag(Integer id, Integer parent_id){
        tagService.deleteTagById(id);
        return "redirect:/tag?parent_id="+parent_id;
    }

    /**
     * 访问 /insertTag 请求 添加分类
     * 同时重定向访问 /tag?parent_id (添加分类的父分类id)，获取该父分类下剩余子分类
     * @param parent_id 父分类id
     * @param name 分类名称
     * @return 重定向访问 redirect:/tag?parent_id=
     */
    @PostMapping("/tag/insertTag")
    public String insertTag(Integer parent_id, String name){
        tagService.insertTag(new Tag(null, name, parent_id));
        return "redirect:/tag?parent_id="+parent_id;
    }
}
