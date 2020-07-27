package com.itzhang.service;

import com.itzhang.pojo.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getAllParentTag();
    List<Tag> getChildTagByParent(Integer parent_id);
    void deleteTagById(Integer id);
    void insertTag(Tag tag);
}
