package com.itzhang.mapper;

import com.itzhang.bean.Cus;
import com.itzhang.bean.CusSearch;
import com.itzhang.bean.Emp;
import com.itzhang.bean.EmpSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: CMS
 * @description: 客户类映射
 * @author: zhang rui feng
 * @create: 2020-07-18 13:14
 */
@Mapper
public interface CusMapper {
    public List<Cus> getAllCus();
    public List<Cus> searchCuss(CusSearch cusSearch);
    public void updateCus(Cus cus);
    public void deleteCus(int id);
    public void insertCus(Cus cus);
}
