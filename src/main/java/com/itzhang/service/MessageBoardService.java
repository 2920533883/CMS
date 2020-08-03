package com.itzhang.service;

import com.itzhang.pojo.Message;

import java.util.List;

/**
 * 留言板服务接口
 */
public interface MessageBoardService {
    List<Message> getAllMessage();

    void confirmMessage(Integer id);
}
