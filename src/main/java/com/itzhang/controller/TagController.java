package com.itzhang.controller;

import com.itzhang.pojo.Tag;
import com.itzhang.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TagController {

    @Autowired
    TagService tagService;

    @RequestMapping("/tag")
    public String toTagPage(Integer parent_id, Model model){
        List<Tag> allParentTag = tagService.getAllParentTag();
        model.addAttribute("ParentTags", allParentTag);
            List<Tag> childTag = tagService.getChildTagByParent(parent_id);
            model.addAttribute("ChildTags", childTag);
        return "/views/tagInfo";
    }

    @RequestMapping("/deleteTag")
    public String deleteTag(Integer id, Integer parent_id){
        System.out.println(id);
        tagService.deleteTagById(id);
        return "redirect:/tag?parent_id="+parent_id;
    }

    @PostMapping("/insertTag")
    public String insertTag(Integer parent_id, String name){
        System.out.println(parent_id+name);
        tagService.insertTag(new Tag(null, name, parent_id));
        return "redirect:/tag?parent_id="+parent_id;
    }
}
