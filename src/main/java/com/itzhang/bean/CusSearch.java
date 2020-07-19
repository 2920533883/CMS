package com.itzhang.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: CMS
 * @description: 客户搜索类
 * @author: zhang rui feng
 * @create: 2020-07-18 09:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CusSearch {
    String name, company, sex , state;
}
