package com.itzhang.mapper;

import com.itzhang.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TagMapper {
    List<Tag> getAllParentTag();
    List<Tag> getChildTagByParent(Integer parent_id);
    void deleteTagById(Integer id);
    void insertTag(Tag tag);
}
