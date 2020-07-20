package com.itzhang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @program: CMS
 * @description: 图表映射
 * @author: zhang rui feng
 * @create: 2020-07-20 10:51
 */
@Mapper
public interface ChartMapper {
    int getManNum();
    int getWomanNum();
}
