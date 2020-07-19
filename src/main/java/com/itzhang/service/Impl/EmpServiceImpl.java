package com.itzhang.service.Impl;

import com.itzhang.bean.Emp;
import com.itzhang.bean.EmpSearch;
import com.itzhang.mapper.EmpMapper;
import com.itzhang.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @program: CMS
 * @description: Emp服务实现类
 * @author: zhang rui feng
 * @create: 2020-07-18 08:25
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    public EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public List<Emp> searchEmps(EmpSearch empSearch) {
        return empMapper.searchEmps(empSearch);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }

    @Override
    public void deleteEmp(int id) {
        empMapper.deleteEmp(id);
    }

    @Override
    public void insertEmp(Emp emp) {
        empMapper.insertEmp(emp);
    }

}
