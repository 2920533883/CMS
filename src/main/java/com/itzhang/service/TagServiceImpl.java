package com.itzhang.service;

import com.itzhang.mapper.TagMapper;
import com.itzhang.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("tagService")
public class TagServiceImpl implements TagService{
    @Autowired
    TagMapper tagMapper;
    @Override
    public List<Tag> getAllParentTag() {
        return tagMapper.getAllParentTag();
    }

    @Override
    public List<Tag> getChildTagByParent(Integer parent_id) {
        return tagMapper.getChildTagByParent(parent_id);
    }

    @Override
    public void deleteTagById(Integer id) {
        tagMapper.deleteTagById(id);
    }

    @Override
    public void insertTag(Tag tag) {
        tagMapper.insertTag(tag);
    }


}
