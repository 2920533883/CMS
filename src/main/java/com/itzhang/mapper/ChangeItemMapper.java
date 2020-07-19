package com.itzhang.mapper;

import com.itzhang.bean.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @program: CMS
 * @description: 修改密码映射
 * @author: zhang rui feng
 * @create: 2020-07-19 14:57
 */

public interface ChangeItemMapper {
    public String checkPassword(String username);
    public int changePassword(@Param("username") String username, @Param("newPass") String newPass);
}
