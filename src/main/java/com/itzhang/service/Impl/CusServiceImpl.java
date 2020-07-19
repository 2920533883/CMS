package com.itzhang.service.Impl;

import com.itzhang.bean.Cus;
import com.itzhang.bean.CusSearch;
import com.itzhang.bean.Emp;
import com.itzhang.mapper.CusMapper;
import com.itzhang.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: CMS
 * @description: 客户服务实现类
 * @author: zhang rui feng
 * @create: 2020-07-18 17:31
 */
@Service("cusService")
public class CusServiceImpl implements CusService {
    @Autowired
    private CusMapper cusMapper;
    @Override
    public List<Cus> getAllCus() {
        return cusMapper.getAllCus();
    }
    @Override
    public List<Cus> searchCuss(CusSearch cusSearch) {
        return cusMapper.searchCuss(cusSearch);
    }

    @Override
    public void insertCus(Cus cus) {
        cusMapper.insertCus(cus);
    }

    @Override
    public void updateCus(Cus cus) {
        cusMapper.updateCus(cus);
    }

    @Override
    public void deleteCus(int id) {
        cusMapper.deleteCus(id);
    }
}
