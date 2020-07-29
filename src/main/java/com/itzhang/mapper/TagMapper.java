package com.itzhang.mapper;

import com.itzhang.pojo.Tag;
import java.util.List;

/**
 * 分类Mapper
 */
public interface TagMapper {
    List<Tag> getAllParentTag();
    List<Tag> getChildTagByParent(Integer parent_id);
    void deleteTagById(Integer id);
    void insertTag(Tag tag);
}
