package com.itzhang.service;

import com.itzhang.mapper.ManagerMapper;
import com.itzhang.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    ManagerMapper managerMapper;
    @Override
    public List<Manager> getAllManager() {
        return managerMapper.getAllManager();
    }

    @Override
    public List<Manager> getManagerByName(String name) {
        return managerMapper.getManagerByName(name);
    }

    @Override
    public Manager getManagerByPhone(String phone) {
        return managerMapper.getManagerByPhone(phone);
    }
}
