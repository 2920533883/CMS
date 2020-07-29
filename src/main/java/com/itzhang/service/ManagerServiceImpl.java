package com.itzhang.service;

import com.itzhang.mapper.ManagerMapper;
import com.itzhang.pojo.JsonRes;
import com.itzhang.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 管理员服务接口实现类
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    ManagerMapper managerMapper;

    /**
     * 获取所有管理员信息
     * @return 能被Lay_ui识别的json数据
     */
    @Override
    public JsonRes getAllManager() {
        List<Manager> allManager = managerMapper.getAllManager();
        return new JsonRes(0, "成功", allManager);
    }

    /**
     * 根据电话号查找管理员，用于登录
     * @param phone 电话号/账号
     * @return 返回查找到的管理员
     */
    @Override
    public Manager getManagerByPhone(String phone) {
        return managerMapper.getManagerByPhone(phone);
    }
}
