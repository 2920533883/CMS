package com.itzhang.service.Impl;

import com.itzhang.mapper.ChartMapper;
import com.itzhang.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: CMS
 * @description: 图表服务实现类
 * @author: zhang rui feng
 * @create: 2020-07-20 10:55
 */
@Service("chartService")
public class ChartServiceImpl implements ChartService {
    @Autowired
    ChartMapper chartMapper;
    @Override
    public int getManNum() {
        return chartMapper.getManNum();
    }

    @Override
    public int getWomanNum() {
        return chartMapper.getWomanNum();
    }
}
