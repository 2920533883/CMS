package com.itzhang.mapper;

import com.itzhang.bean.Emp;
import com.itzhang.bean.EmpSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: CMS
 * @description: 员工类映射
 * @author: zhang rui feng
 * @create: 2020-07-18 08:14
 */
@Mapper
public interface EmpMapper {
    public List<Emp> getAllEmp();
    public List<Emp> searchEmps(EmpSearch empSearch);
    public void updateEmp(Emp emp);
    public void deleteEmp(int id);
    public void insertEmp(Emp emp);
}
