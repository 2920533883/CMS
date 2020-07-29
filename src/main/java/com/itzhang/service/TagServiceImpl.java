package com.itzhang.service;

import com.itzhang.mapper.TagMapper;
import com.itzhang.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 分类服务接口实现类
 */
@Service("tagService")
public class TagServiceImpl implements TagService{
    @Autowired
    TagMapper tagMapper;

    /**
     * 获取所有父分类
     * @return List<Tag>
     */
    @Override
    public List<Tag> getAllParentTag() {
        return tagMapper.getAllParentTag();
    }

    /**
     * 根据父分类id查找对应子分类
     * @param parent_id 父分类id
     * @return List<Tag>
     */
    @Override
    public List<Tag> getChildTagByParent(Integer parent_id) {
        return tagMapper.getChildTagByParent(parent_id);
    }

    /**
     * 根据分类id删除分类
     * @param id 分类id
     */
    @Override
    public void deleteTagById(Integer id) {
        tagMapper.deleteTagById(id);
    }

    /**
     * 插入一个分类
     * @param tag 分类
     */
    @Override
    public void insertTag(Tag tag) {
        tagMapper.insertTag(tag);
    }


}
