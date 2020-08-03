package com.itzhang.service;

import com.itzhang.mapper.MessageBoardMapper;
import com.itzhang.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 留言板服务接口实现类
 */
@Service("messageBoardService")
public class MessageBoardServiceImpl implements MessageBoardService {
    @Autowired
    MessageBoardMapper messageBoardMapper;
    @Override
    public List<Message> getAllMessage() {
        return messageBoardMapper.getAllMessage();
    }

    @Override
    public void confirmMessage(Integer id) {
        messageBoardMapper.deleteMessageById(id);
    }
}
