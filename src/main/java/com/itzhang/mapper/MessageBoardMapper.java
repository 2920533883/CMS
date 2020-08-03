package com.itzhang.mapper;

import com.itzhang.pojo.Message;

import java.util.List;

/**
 * 留言板Mapper
 */
public interface MessageBoardMapper {
    List<Message> getAllMessage();
    void deleteMessageById(Integer id);
}
