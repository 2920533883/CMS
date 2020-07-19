package com.itzhang.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: CMS
 * @description: 员工搜索类
 * @author: zhang rui feng
 * @create: 2020-07-18 09:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpSearch {
    String username, realName, role , state;
}
