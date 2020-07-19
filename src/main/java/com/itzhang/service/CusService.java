package com.itzhang.service;

import com.itzhang.bean.Cus;
import com.itzhang.bean.CusSearch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: CMS
 * @description: 客户服务接口
 * @author: zhang rui feng
 * @create: 2020-07-18 17:31
 */
public interface CusService {
    List<Cus> getAllCus();
    List<Cus> searchCuss(CusSearch cusSearch);
    void insertCus(Cus cus);
    void updateCus(Cus cus);
    void deleteCus(int id);
}
