package com.itzhang.service;

import com.itzhang.bean.Emp;
import com.itzhang.bean.EmpSearch;

import java.util.List;

/**
 * @program: CMS
 * @description: Emp服务接口
 * @author: zhang rui feng
 * @create: 2020-07-18 08:24
 */
public interface EmpService {
    List<Emp> getAllEmp();
    List<Emp> searchEmps(EmpSearch empSearch);
    void updateEmp(Emp emp);
    void deleteEmp(int id);
    void insertEmp(Emp emp);
}
